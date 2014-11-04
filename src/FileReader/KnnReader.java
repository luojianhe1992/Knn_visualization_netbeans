package FileReader;


import KnnStorage.KnnNode;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;


public class KnnReader {
public static CSVParseResult parse(String path, Class<? extends KnnNode> type) {
		InputStream stream = KnnReader.class.getClassLoader().getResourceAsStream(path);
		return parse(stream, 1, new int[] { 0, 1, 2, 3 }, 4, type);
	}

	public static CSVParseResult parseOutsource(String path, Class<? extends KnnNode> type) {
		InputStream stream = null;
		try {
			stream = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return parse(stream, 1, new int[] { 0, 1, 2, 3 }, 4, type);
	}

	public static CSVParseResult parse(InputStream stream, int skipline, int[] featureColumnIndex, int labelColumn, Class<? extends KnnNode> type) {
		List<KnnNode> data_result = new ArrayList<KnnNode>();
		List<String> title_result = new ArrayList<String>();

		CSVParser parse;
		List<CSVRecord> records = null;
		try {
			parse = CSVFormat.EXCEL.parse(new InputStreamReader(stream, "ISO-8859-1"));
			records = parse.getRecords();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		for (CSVRecord record : records) {
			if (record.getRecordNumber() <= skipline)
				continue;
			if (record.getRecordNumber() == skipline + 1) {
				for (int i = 0; i < featureColumnIndex.length; i++) {
					title_result.add(record.get(featureColumnIndex[i]));
				}
			} else {
				double[] features = new double[featureColumnIndex.length];

				for (int i = 0; i < featureColumnIndex.length; i++) {

					double feature = Double.parseDouble(record.get(featureColumnIndex[i]));
					features[i] = feature;
				}
				KnnNode instance = null;
				try {
					instance = type.newInstance();
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					System.err.println("visible default constructor needed~");
					e.printStackTrace();
				}
				instance.setLabel(record.get(labelColumn));
				instance.setFeature(features);
				data_result.add(instance);
			}
		}
		return new CSVParseResult(data_result, title_result);
	}

	public static class CSVParseResult {
		List<KnnNode> data;
		List<String> titles;

		public CSVParseResult(List<KnnNode> data, List<String> titles) {
			super();
			this.data = data;
			this.titles = titles;
		}

		public List<KnnNode> getData() {
			return data;
		}

		public void setData(List<KnnNode> data) {
			this.data = data;
		}

		public List<String> getTitles() {
			return titles;
		}

		public void setTitles(List<String> titles) {
			this.titles = titles;
		}

	}
}
