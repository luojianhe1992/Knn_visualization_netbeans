/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import KnnStorage.KnnNode;
import KnnStorage.KnnNodeList;
import Util.PaintingUtil;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author 健和
 */
public class DrawingPanel extends javax.swing.JPanel {

    //use List to store the trainingdata
    private List<KnnNode> trainingdata;
    //use List to store the testingdata
    private List<KnnNode> testingdata;
    
    //use x_smallest,y_smallest,x_max,y_max to store the square the whole point
    private double x_max;
    private double x_smallest;
    private double y_max;
    private double y_smallest;
    
    //use x_smallestintrainingdata, y_smallestintrainingdata, x_maxintrainingdata, y_maxintrainingdata to store the square of the trainingdata
    private double x_maxintrainingdata;
    private double y_maxintrainingdata;
    private double x_smallestintrainingdata;
    private double y_smallestintrainingdata;
    
    //use x_smallestintestingdata, y_smallestintestingdata, x_maxintestingdata, y_maxintestingdata to store the square of the testingdata
    private double x_maxintestingdata;
    private double y_maxintestingdata;
    private double x_smallestintestingdata;
    private double y_smallestintestingdata;
    
    //record the scale of x-coordinator and scale of y-coordinator
    private double scaleX;
    private double scaleY;
    
    private double scaleXintrainingdata;
    private double scaleYintrainingdata;
    
    private double scaleXintestingdata;
    private double scaleYintestingdata;
    
    
            
    //record the two features that display in 2 dimension
    private int feature2d1 = 0;
    private int feature2d2 = 1;
    
    //record the starpoint
    private double startingpointofx;
    private double startingpointofy;
    
    private KnnNode testingnode = null;
    
    //to store the types of label in the training data
    private List<String> labellist = null;

    public List<String> getLabellist() {
        return labellist;
    }

    public void setLabellist(List<String> labellist) {
        this.labellist = labellist;
    }
    
    

    public double getX_max() {
        return x_max;
    }

    public void setX_max(double x_max) {
        this.x_max = x_max;
    }

    public double getX_smallest() {
        return x_smallest;
    }

    public void setX_smallest(double x_smallest) {
        this.x_smallest = x_smallest;
    }

    public double getY_max() {
        return y_max;
    }

    public void setY_max(double y_max) {
        this.y_max = y_max;
    }

    public double getY_smallest() {
        return y_smallest;
    }

    public void setY_smallest(double y_smallest) {
        this.y_smallest = y_smallest;
    }

    public double getX_maxintrainingdata() {
        return x_maxintrainingdata;
    }

    public void setX_maxintrainingdata(double x_maxintrainingdata) {
        this.x_maxintrainingdata = x_maxintrainingdata;
    }

    public double getY_maxintrainingdata() {
        return y_maxintrainingdata;
    }

    public void setY_maxintrainingdata(double y_maxintrainingdata) {
        this.y_maxintrainingdata = y_maxintrainingdata;
    }

    public double getX_smallestintrainingdata() {
        return x_smallestintrainingdata;
    }

    public void setX_smallestintrainingdata(double x_smallestintrainingdata) {
        this.x_smallestintrainingdata = x_smallestintrainingdata;
    }

    public double getY_smallestintrainingdata() {
        return y_smallestintrainingdata;
    }

    public void setY_smallestintrainingdata(double y_smallestintrainingdata) {
        this.y_smallestintrainingdata = y_smallestintrainingdata;
    }

    public double getX_maxintestingdata() {
        return x_maxintestingdata;
    }

    public void setX_maxintestingdata(double x_maxintestingdata) {
        this.x_maxintestingdata = x_maxintestingdata;
    }

    public double getY_maxintestingdata() {
        return y_maxintestingdata;
    }

    public void setY_maxintestingdata(double y_maxintestingdata) {
        this.y_maxintestingdata = y_maxintestingdata;
    }

    public double getX_smallestintestingdata() {
        return x_smallestintestingdata;
    }

    public void setX_smallestintestingdata(double x_smallestintestingdata) {
        this.x_smallestintestingdata = x_smallestintestingdata;
    }

    public double getY_smallestintestingdata() {
        return y_smallestintestingdata;
    }

    public void setY_smallestintestingdata(double y_smallestintestingdata) {
        this.y_smallestintestingdata = y_smallestintestingdata;
    }

    public double getScaleX() {
        return scaleX;
    }

    public void setScaleX(double scaleX) {
        this.scaleX = scaleX;
    }

    public double getScaleY() {
        return scaleY;
    }

    public void setScaleY(double scaleY) {
        this.scaleY = scaleY;
    }

    public double getScaleXintrainingdata() {
        return scaleXintrainingdata;
    }

    public void setScaleXintrainingdata(double scaleXintrainingdata) {
        this.scaleXintrainingdata = scaleXintrainingdata;
    }

    public double getScaleYintrainingdata() {
        return scaleYintrainingdata;
    }

    public void setScaleYintrainingdata(double scaleYintrainingdata) {
        this.scaleYintrainingdata = scaleYintrainingdata;
    }

    public double getScaleXintestingdata() {
        return scaleXintestingdata;
    }

    public void setScaleXintestingdata(double scaleXintestingdata) {
        this.scaleXintestingdata = scaleXintestingdata;
    }

    public double getScaleYintestingdata() {
        return scaleYintestingdata;
    }

    public void setScaleYintestingdata(double scaleYintestingdata) {
        this.scaleYintestingdata = scaleYintestingdata;
    }

    public int getFeature2d1() {
        return feature2d1;
    }

    public void setFeature2d1(int feature2d1) {
        this.feature2d1 = feature2d1;
    }

    public int getFeature2d2() {
        return feature2d2;
    }

    public void setFeature2d2(int feature2d2) {
        this.feature2d2 = feature2d2;
    }

    public double getStartingpointofx() {
        return startingpointofx;
    }

    public void setStartingpointofx(double startingpointofx) {
        this.startingpointofx = startingpointofx;
    }

    public double getStartingpointofy() {
        return startingpointofy;
    }

    public void setStartingpointofy(double startingpointofy) {
        this.startingpointofy = startingpointofy;
    }

    public KnnNode getTestingnode() {
        return testingnode;
    }

    public void setTestingnode(KnnNode testingnode) {
        this.testingnode = testingnode;
    }
    
    
    
    
    public double getx_maxintrainingdata(){    
        x_maxintrainingdata = trainingdata.get(0).getFeature()[feature2d1];
        for(int i=0;i<trainingdata.size();i++){
            if(x_maxintrainingdata<trainingdata.get(i).getFeature()[feature2d1]){
                x_maxintrainingdata = trainingdata.get(i).getFeature()[feature2d1];
            }
        }
        return x_maxintrainingdata;
    }
    public double gety_maxintrainingdata(){
        y_maxintrainingdata = trainingdata.get(0).getFeature()[feature2d2];
        for(int i=0;i<trainingdata.size();i++){
            if(y_maxintrainingdata<trainingdata.get(i).getFeature()[feature2d2]){
                y_maxintrainingdata = trainingdata.get(i).getFeature()[feature2d2];
            }
        }
        return y_maxintrainingdata;
    }
    public double getx_smallestintrainingdata(){
        x_smallestintrainingdata = trainingdata.get(0).getFeature()[feature2d1];
        for(int i=0;i<trainingdata.size();i++){
            if(x_smallestintrainingdata>trainingdata.get(i).getFeature()[feature2d1]){
                x_smallestintrainingdata = trainingdata.get(i).getFeature()[feature2d1];
            }
        }
        return x_smallestintrainingdata;
        
    }
    public double gety_smallestintrainingdata(){
        y_smallestintrainingdata = trainingdata.get(0).getFeature()[feature2d2];
        for(int i=0;i<trainingdata.size();i++){
            if(y_smallestintrainingdata>trainingdata.get(i).getFeature()[feature2d2]){
                y_smallestintrainingdata = trainingdata.get(i).getFeature()[feature2d2];
            }
        }
        return y_smallestintrainingdata;
    }
    public double getx_maxintestingdata(){
        x_maxintestingdata = testingdata.get(0).getFeature()[feature2d1];
        for(int i=0;i<testingdata.size();i++){
            if(x_maxintestingdata<testingdata.get(i).getFeature()[feature2d1]){
                x_maxintestingdata = testingdata.get(i).getFeature()[feature2d1];
            }
        }
        return x_maxintestingdata;
        
    }
    public double gety_maxintestingdata(){
        y_maxintestingdata = testingdata.get(0).getFeature()[feature2d2];
        for(int i=0;i<testingdata.size();i++){
            if(y_maxintestingdata<testingdata.get(i).getFeature()[feature2d2]){
                y_maxintestingdata = testingdata.get(i).getFeature()[feature2d2];
            }
        }
        return y_maxintestingdata;
    }
    public double getx_smallestintestingdata(){
        x_smallestintestingdata = testingdata.get(0).getFeature()[feature2d1];
        for(int i=0;i<testingdata.size();i++){
            if(x_smallestintestingdata>testingdata.get(i).getFeature()[feature2d1]){
                x_smallestintestingdata = testingdata.get(i).getFeature()[feature2d1];
            }
        }
        return x_smallestintestingdata;
    }
    public double gety_smallestintestingdata(){
        y_smallestintestingdata = testingdata.get(0).getFeature()[feature2d2];
        for(int i=0;i<testingdata.size();i++){
            if(y_smallestintestingdata>testingdata.get(i).getFeature()[feature2d2]){
                y_smallestintestingdata = testingdata.get(i).getFeature()[feature2d2];
            }
        }
        return y_smallestintestingdata;
    }
    
    
    public double getx_max(){
        List<KnnNode> allnodelist = new ArrayList<KnnNode>();
        if(trainingdata!=null){
            for(int i=0;i<trainingdata.size();i++){
                allnodelist.add(trainingdata.get(i));
            }
        }
        if(testingdata!=null){
          
            for(int i=0;i<testingdata.size();i++){
                allnodelist.add(testingdata.get(i));
            }
        }
        x_max = allnodelist.get(0).getFeature()[feature2d1];
        for(int i=0;i<allnodelist.size();i++){
            if(x_max<allnodelist.get(i).getFeature()[feature2d1])
                x_max = allnodelist.get(i).getFeature()[feature2d1];
        }
        return x_max;
    }
    
    public double getx_smallest(){
        List<KnnNode> allnodelist = new ArrayList<KnnNode>();
        if(trainingdata!=null){
            allnodelist.addAll(trainingdata);
        }
        if(testingdata!=null){
            allnodelist.addAll(testingdata);
        }
        x_smallest = allnodelist.get(0).getFeature()[feature2d1];
        for(int i=0;i<allnodelist.size();i++){
            if(x_smallest>allnodelist.get(i).getFeature()[feature2d1])
                x_smallest = allnodelist.get(i).getFeature()[feature2d1];
        }
        return x_smallest;
    }
    
    public double gety_max(){

        List<KnnNode> allnodelist = new ArrayList<KnnNode>();
        if(trainingdata!=null){
            allnodelist.addAll(trainingdata);
        }
        if(testingdata!=null){
            allnodelist.addAll(testingdata);
        }
        y_max = allnodelist.get(0).getFeature()[feature2d2];
        for(int i=0;i<allnodelist.size();i++){
            if(y_max<allnodelist.get(i).getFeature()[feature2d2]){
                y_max = allnodelist.get(i).getFeature()[feature2d2];
            }
        }
        return y_max;
    }
    
    public double gety_smallest(){
        List<KnnNode> allnodelist = new ArrayList<KnnNode>();
        if(trainingdata!=null){
            allnodelist.addAll(trainingdata);
        }
        if(testingdata!=null){
            allnodelist.addAll(testingdata);
        }
        y_smallest = allnodelist.get(0).getFeature()[feature2d2];
        for(int i=0;i<allnodelist.size();i++){
            if(y_smallest>allnodelist.get(i).getFeature()[feature2d2]){
                y_smallest = allnodelist.get(i).getFeature()[feature2d2];
            }
        }
        return y_smallest;
    }
    
    public double get_scaleX(){
        
        double temp = (getx_max()-getx_smallest());
        
        scaleX = 0.6*getWidth()/temp;
        return scaleX;
    }
    
    public double get_scaleY(){
        
        double temp = (gety_max()-gety_smallest());
        
        scaleY = 0.6*getHeight()/temp;
        return scaleY;
    }
    
    public double get_scaleXintrainingdata(){
        double temp = (getx_maxintrainingdata()-getx_smallestintrainingdata());
        
        scaleXintrainingdata = 0.6*getWidth()/temp;
        
        return scaleXintrainingdata;
    }
    public double get_scaleYintrainingdata(){
       
        double temp = gety_maxintrainingdata()-gety_smallestintrainingdata();
        
        scaleYintrainingdata = 0.6*getHeight()/temp;
        
        return scaleYintrainingdata;
    }
    
    public double get_scaleXintestingdata(){
    
        double temp = getx_maxintestingdata()-getx_smallestintestingdata();
        
        scaleXintestingdata = 0.6*getWidth()/temp;
        
        return scaleXintestingdata;
    }
    public double get_scaleYintestingdata(){

        double temp = gety_maxintestingdata()-gety_smallestintestingdata();
        
        scaleYintestingdata = 0.6*getHeight()/temp;
        
        return scaleYintestingdata;
    }
    
    
    public double get_startingpointofx(){
        double temp = getx_max()-getx_smallest();
        temp = temp*get_scaleX()*0.05;
        startingpointofx = getx_smallest()*get_scaleX()-temp;
        return startingpointofx;
    }
    
    public double get_startingpointofy(){
        double temp = gety_max()-gety_smallest();
        temp = temp*get_scaleX()*0.05;
        startingpointofy = gety_smallest()*get_scaleX()-temp;
        return startingpointofy;
    }
   
    

    public List<KnnNode> getTrainingdata() {
        return trainingdata;
    }

    public void setTrainingdata(List<KnnNode> trainingdata) {
        this.trainingdata = trainingdata;
    }

    public List<KnnNode> getTestingdata() {
        return testingdata;
    }

    public void setTestingdata(List<KnnNode> testingdata) {
        this.testingdata = testingdata;
    }
    
    
    
    /**
     * Creates new form DrawingPanel
     */
    public DrawingPanel() {
        initComponents();
    }

    //每次调用repaint()函数时，调用paintComponent()函数
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
    
        System.out.println("invoke the function paintComponent()");
        
        
        
        //drawing the training data
        if(trainingdata!=null){
            
            System.out.println("trainingdata is:"+trainingdata);
           
            Iterator<KnnNode> it_node = trainingdata.iterator();
            
            //drawing scatter point
            while(it_node.hasNext()){
               KnnNode ob = it_node.next();
               
               System.out.println("ob is:"+ob);
               
               int pointxintrainingdata;
               int pointyintrainingdata;
               
               System.out.println("the width is:"+getWidth());
               System.out.println("the height is:"+getHeight());
               
               System.out.println("the scaleXintrainingdata is:"+get_scaleXintrainingdata());
               System.out.println("the scaleYintrainingdata is:"+get_scaleYintrainingdata());
               
               System.out.println("the getx_maxintrainingdata is:"+getx_maxintrainingdata());
               System.out.println("the getx_smallestintrainingdata is:"+getx_smallestintrainingdata());
               
               System.out.println("the gety_maxintrainingdata is:"+gety_maxintrainingdata());
               System.out.println("the gety_smallestintrainingdata is:"+gety_smallestintrainingdata());
               
               
               System.out.println("judgement 1:"+ob.getLabel().equals(labellist.get(0)));
               if(ob.getLabel().equals(labellist.get(0))){
                   g.setColor(Color.red);
                   System.out.println("the first label node");
                   
                   int pointxintrainingdatainlabel1;
                   int pointyintrainingdatainlabel1;
                   
                   pointxintrainingdatainlabel1 = (int)((ob.getFeature()[feature2d1]-getx_smallestintrainingdata())*get_scaleX()+0.20*getWidth());
                   pointyintrainingdatainlabel1 = (int)((ob.getFeature()[feature2d2]-gety_smallestintrainingdata())*get_scaleY()+0.20*getHeight());
                   System.out.println("the first label pointxintrainingdata is:"+pointxintrainingdatainlabel1);
                   System.out.println("the first label pointyintrainingdata is:"+pointyintrainingdatainlabel1);
                   PaintingUtil.paint2DScatterPoint(g, pointxintrainingdatainlabel1,pointyintrainingdatainlabel1);
               }
               System.out.println("judgement 2:"+ob.getLabel().equals(labellist.get(1)));
               if(ob.getLabel().equals(labellist.get(1))){
                   g.setColor(Color.green);
                   System.out.println("the second label node");
                   
                   int pointxintrainingdatainlabel2;
                   int pointyintrainingdatainlabel2;

                   pointxintrainingdatainlabel2 = (int)((ob.getFeature()[feature2d1]-getx_smallestintrainingdata())*get_scaleX()+0.20*getWidth());
                   pointyintrainingdatainlabel2 = (int)((ob.getFeature()[feature2d2]-gety_smallestintrainingdata())*get_scaleY()+0.20*getHeight());
                   System.out.println("the second label pointxintrainingdata is:"+pointxintrainingdatainlabel2);
                   System.out.println("the second label pointyintrainingdata is:"+pointyintrainingdatainlabel2);
                   PaintingUtil.paint2DScatterPoint(g, pointxintrainingdatainlabel2,pointyintrainingdatainlabel2);
               }
               System.out.println("judgement 3:"+ob.getLabel().equals(labellist.get(2)));
               if(ob.getLabel().equals(labellist.get(2))){
                   g.setColor(Color.blue);
                   System.out.println("the third label node");
                   
                   int pointxintrainingdatainlabel3;
                   int pointyintrainingdatainlabel3;
                   
                   pointxintrainingdatainlabel3 = (int)((ob.getFeature()[feature2d1]-getx_smallestintrainingdata())*get_scaleX()+0.20*getWidth());
                   pointyintrainingdatainlabel3 = (int)((ob.getFeature()[feature2d2]-gety_smallestintrainingdata())*get_scaleY()+0.20*getHeight());
                   System.out.println("the third label pointxintrainingdata is:"+pointxintrainingdatainlabel3);
                   System.out.println("the third label pointyintrainingdata is:"+pointyintrainingdatainlabel3);
                   PaintingUtil.paint2DScatterPoint(g, pointxintrainingdatainlabel3,pointyintrainingdatainlabel3);
               }
            }
            
            //the point to draw line
            int linex1 = (int)((getx_smallestintrainingdata()-getx_smallestintrainingdata())*get_scaleX()+0.20*getWidth());
            int liney1 = (int)((gety_smallestintrainingdata()-gety_smallestintrainingdata())*get_scaleY()+0.20*getHeight());
            int linex2 = (int)((getx_maxintrainingdata()-getx_smallestintrainingdata())*get_scaleX()+0.20*getWidth());
            int liney2 = (int)((gety_maxintrainingdata()-gety_smallestintrainingdata())*get_scaleY()+0.20*getHeight());
            
            System.out.println("getx_maxintrainingdata()-getx_smallestintrainingdata()="+(getx_maxintrainingdata()-getx_smallestintrainingdata()));
            System.out.println("gety_maxintrainingdata()-gety_smallestintrainingdata()="+(gety_maxintrainingdata()-gety_smallestintrainingdata()));
            
            
            
            
            System.out.println("linex1 in trainingdata is:"+linex1);
            System.out.println("liney1 in trainingdata is:"+liney1);
            System.out.println("linex2 in trainingdata is:"+linex2);
            System.out.println("liney2 in trainingdata is:"+liney2);
            /*
            PaintingUtil.paint2DLine(g, linex1, liney1, linex2, liney2);
            PaintingUtil.paint2DLine(g, linex1, liney1, linex1, liney2);
            PaintingUtil.paint2DLine(g, linex1, liney1, linex2, liney1);
            PaintingUtil.paint2DLine(g, linex1, liney2, linex2, liney2);
            PaintingUtil.paint2DLine(g, linex2, liney1, linex2, liney2);
            */
        
        }
        
        //drawing the testing data
        if(testingdata!=null){
            g.setColor(Color.black);
            
            System.out.println("testingdata is:"+testingdata);
            
            Iterator<KnnNode> it_node = testingdata.iterator();
            
            //drawing scatter point
            while(it_node.hasNext()){
                
                g.setColor(Color.black);
                
                KnnNode ob = it_node.next();
                
                System.out.println("KnnNode ob of testingdata is:"+ob);
                
                int pointxintestingdata;
                int pointyintestingdata;
                
                System.out.println("the width is:"+getWidth());
                System.out.println("the height is:"+getHeight());
               
                System.out.println("the scaleXintestingdata is:"+get_scaleXintestingdata());
                System.out.println("the scaleYintrainingdata is:"+get_scaleYintestingdata());
               
                System.out.println("the getx_maxintestingdata is:"+getx_maxintestingdata());
                System.out.println("the getx_smallestintestingdata is:"+getx_smallestintestingdata());
                
                System.out.println("the gety_maxintestingdata is:"+gety_maxintestingdata());
                System.out.println("the gety_smallestintestingdata is:"+gety_smallestintestingdata());
                
                
                pointxintestingdata = (int)((ob.getFeature()[feature2d1]-getx_smallest())*get_scaleX()+0.20*getWidth());
                pointyintestingdata = (int)((ob.getFeature()[feature2d2]-gety_smallest())*get_scaleY()+0.20*getHeight());
                
                System.out.println("pointxintestingdata is:"+pointxintestingdata);
                System.out.println("pointyintestingdata is:"+pointyintestingdata);
                
                PaintingUtil.paint2DScatterPoint(g, pointxintestingdata, pointyintestingdata);    
            }
            
            int linex1;
            int liney1;
            int linex2;
            int liney2;
            
            linex1 = (int)((getx_smallestintestingdata()-getx_smallestintestingdata())*get_scaleX()+0.20*getWidth());
            liney1 = (int)((gety_smallestintestingdata()-gety_smallestintestingdata())*get_scaleY()+0.20*getHeight());
            linex2 = (int)((getx_maxintestingdata()-getx_smallestintestingdata())*get_scaleX()+0.20*getWidth());
            liney2 = (int)((gety_maxintestingdata()-gety_smallestintestingdata())*get_scaleY()+0.20*getHeight());
            
            System.out.println("getx_maxintestingdata()-getx_smallestintestingdata()"+(getx_maxintestingdata()-getx_smallestintestingdata()));
            System.out.println("gety_maxintestingdata()-gety_smallestintestingdata()"+(gety_maxintestingdata()-gety_smallestintestingdata()));
            
            System.out.println("linex1 in testingdata is:"+linex1);
            System.out.println("liney1 in testingdata is:"+liney1);
            System.out.println("linex2 in testingdata is:"+linex2);
            System.out.println("liney2 in testingdata is:"+liney2);
            
            /*
            PaintingUtil.paint2DLine(g, linex1, liney1, linex2, liney2);
            PaintingUtil.paint2DLine(g, linex1, liney1, linex1, liney2);
            PaintingUtil.paint2DLine(g, linex1, liney1, linex2, liney1);
            PaintingUtil.paint2DLine(g, linex1, liney2, linex2, liney2);
            PaintingUtil.paint2DLine(g, linex2, liney1, linex2, liney2);
            */
        }
        
        if(testingdata!=null&&trainingdata!=null){
            
            
            g.setColor(Color.blue);
            
            int linex1;
            int liney1;
            int linex2;
            int liney2;
            
            linex1 = (int)((getx_smallest()-getx_smallest())*get_scaleX()+0.20*getWidth());
            liney1 = (int)((gety_smallest()-gety_smallest())*get_scaleY()+0.20*getHeight());
            linex2 = (int)((getx_max()-getx_smallest())*get_scaleX()+0.20*getWidth());
            liney2 = (int)((gety_max()-gety_smallest())*get_scaleY()+0.20*getHeight());
            
            System.out.println("linex1 in alldata is:"+linex1);
            System.out.println("liney1 in alldata is:"+liney1);
            System.out.println("linex2 in alldata is:"+linex2);
            System.out.println("liney2 in alldata is:"+liney2);
            
            /*
            PaintingUtil.paint2DLine(g, linex1, liney1, linex2, liney2);
            PaintingUtil.paint2DLine(g, linex1, liney1, linex1, liney2);
            PaintingUtil.paint2DLine(g, linex1, liney1, linex2, liney1);
            PaintingUtil.paint2DLine(g, linex1, liney2, linex2, liney2);
            PaintingUtil.paint2DLine(g, linex2, liney1, linex2, liney2);
            */
        }
        
        if(testingnode!=null){
            KnnNodeList testingdataknnnodelist = new KnnNodeList((ArrayList)trainingdata,null);
            
            List<Double> distances = new ArrayList<Double>();
            
            distances = testingdataknnnodelist.distCal_group(testingnode);
            
            for(int i=0; i<distances.size();i++){
                for(int j=i;j<distances.size();j++){
                    if(distances.get(i)>distances.get(j)){
                        //交换位置
                        Double temp;
                        temp = distances.get(i);
                        distances.set(i, distances.get(j));
                        distances.set(j, temp);
                        
                        //交换位置
                        KnnNode tempnode = new KnnNode();
                        tempnode = testingdataknnnodelist.getNodeList().get(i);
                        testingdataknnnodelist.getNodeList().set(i, testingdataknnnodelist.getNodeList().get(j));
                        testingdataknnnodelist.getNodeList().set(j, tempnode);
                    }
                }
            }
            List<int[]> lines = new ArrayList<int[]>();
            
            for(int i=0;i<10;i++){
            
                int [] line_int = new int [2];
                double [] line_double = new double [2];
                line_double[0] = testingdataknnnodelist.getNodeList().get(i).getFeature()[feature2d1];
                line_double[1] = testingdataknnnodelist.getNodeList().get(i).getFeature()[feature2d2];
                
                line_int[0] = (int)((line_double[0]-getx_smallest())*get_scaleX()+0.20*getWidth());
                line_int[1] = (int)((line_double[1]-gety_smallest())*get_scaleY()+0.20*getHeight());
                
                int[] testingnode_int = new int[2];
                testingnode_int[0] = (int)((testingnode.getFeature()[feature2d1]-getx_smallest())*get_scaleX()+0.20*getWidth());
                testingnode_int[1] = (int)((testingnode.getFeature()[feature2d2]-gety_smallest())*get_scaleY()+0.20*getHeight());
           
                g.setColor(Color.PINK);
                
                PaintingUtil.paint2DLine(g, testingnode_int[0], testingnode_int[1], line_int[0], line_int[1]);
                
                
            }
                
            
            
        }
        
        
        
        
    
    
    }

    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */;
            
            
            
        

        
        
        
        
    
    

    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
