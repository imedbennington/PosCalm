/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calmstreetcoffeshop;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author 21654
 */
public class Stats extends javax.swing.JFrame {

    Connect cnx = new Connect();
    Statement st;
    Timer timer;
    public Stats() {
        initComponents();
        Icon();
        getmonth();
        jLabel8.setVisible(true);
        ActionListener actionListener = new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                //time
                java.util.Date date = new java.util.Date();
                DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
                String time = timeFormat.format(date);
                time_label.setText(time);
                //date
                java.util.Date date2 = new java.util.Date();
                DateFormat timeFormat2 = new SimpleDateFormat("dd/MM/yyyy");
                String time2 = timeFormat2.format(date2);
                date_label.setText(time2);
                /*jDateChooser1.setDate(date);
                String addDate = timeFormat2.format(jDateChooser1.getDate()); System.out.print(addDate);
                jLabel8.setText(addDate);*/
            }
        };
        timer = new Timer (1000, actionListener);
        timer.setInitialDelay(0);
        timer.start();
        affiche_drinks ();
    }
    void  Icon(){     
JFrame f=new JFrame();     
Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\21654\\Documents\\NetBeansProjects\\CalmStreetCoffeshop\\icons\\icon.png");    
this.setIconImage(icon);    
     
}
void affiche_drinks (){
     try{
             st=(Statement) cnx.obtenircon().createStatement();
            ResultSet rs=st.executeQuery("select name, category from drink");
            while(rs.next()){
                String name = rs.getString("name");
                String category = rs.getString("category");System.out.print(category);
                switch(category){
                    case "Hookah":
                        hookah.addItem(name);
                        hookah_month.addItem(name);
                        hookah_year.addItem(name);
                    break;
                    case "Coffee and tea":
                        drinks.addItem(name);
                        drinks_month.addItem(name);
                        drinks_year.addItem(name);
                        break;
                    case "Soda":
                        water_soda.addItem(name);
                        water_month.addItem(name);
                        water_year.addItem(name);
                    break;
                    case "Water":
                        water_soda.addItem(name);
                        water_month.addItem(name);
                        water_year.addItem(name);
                        break;
                    case "Délice":
                        délice.addItem(name);
                        délice_month.addItem(name);
                        délice_year.addItem(name);
                        break;
                    case "jus":
                        juce.addItem(name);
                        juce_month.addItem(name);
                        juce_year.addItem(name);
                        break;
                    case "Crépes":
                        crépes.addItem(name);
                        crépes_month.addItem(name);
                        crépes_year.addItem(name);
                        break;
                    case "Jwajem":
                        jwajem_day.addItem(name);
                        jwajem_month.addItem(name);
                        jwajem_year.addItem(name);
                        break;
                        
                }  
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane,e);
        }
} 
  void get_qte_drinks_month (){
      try{ 
          int month = jMonthChooser1.getMonth()+1;System.out.println("Month date chooser "+month);
          int monthselect = get_month();
          int year = Year.now().getValue();
          String query = "select SUM(qte) as qtedrinks, SUM(total) as totaldrinks from stats where drink ='"+drinks_month.getSelectedItem()+"'  and EXTRACT(month from date) = '"+monthselect+"' and EXTRACT(year from date) = '"+year+"'";
          int totmonth;
          double totaldrinksmonth;
          st=(Statement) cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while(rs.next()){
              totmonth=rs.getInt("qtedrinks");System.out.print(totmonth);
              totaldrinksmonth = rs.getDouble("totaldrinks");
              total_drinks_month.setText(""+totmonth);
              taking_drinks_month.setText(""+totaldrinksmonth);
          }
      }catch(Exception e){
          //JOptionPane.showMessageDialog(rootPane, e);
  }
  }
  void get_qte_drinks_year(){
      try{ 
          int year = jYearChooser1.getYear();System.out.println("Year from chooser "+year);
          //int monthselect = get_month();
          String query = "select SUM(qte) as qtedrinks, SUM(total) as totaldrinks from stats where drink ='"+drinks_year.getSelectedItem()+"'  and EXTRACT(year from date) = '"+year+"'";
          int totyear;
          double takingdrinks_year;
          st=(Statement) cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while(rs.next()){
              totyear=rs.getInt("qtedrinks");System.out.print(totyear);
              takingdrinks_year = rs.getDouble("totaldrinks");
              total_drinks_year.setText(""+totyear);
              taking_drinks_year.setText(""+takingdrinks_year);
          }
      }catch(Exception e){
          //JOptionPane.showMessageDialog(rootPane, e);
  }
  }
  void get_qte_drinks(){
      try{ 
        SimpleDateFormat tdate = new SimpleDateFormat("dd/MM/yyyy");
        String addDate = tdate.format(jDateChooser1.getDate()); System.out.print(addDate);
        jLabel8.setText(addDate);
        java.util.Date date;
        date = tdate.parse(addDate);
        java.sql.Date sqldate = new java.sql.Date(date.getTime());System.out.println("sql date drinks "+sqldate);
          String query = "select SUM(qte) as total, SUM(total) as totaldrinks from stats where drink ='"+drinks.getSelectedItem()+"'  and date='"+sqldate+"'";
          int tot;
          double totaldrinks;
          st=(Statement) cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while(rs.next()){
              tot=rs.getInt("total");System.out.print(tot);
              totaldrinks = rs.getDouble("totaldrinks");
              total_drinks.setText(""+tot);
              taking_drinks.setText(""+totaldrinks);
          }
      }catch(Exception e){
          //JOptionPane.showMessageDialog(rootPane, e);
      }
  } 
  ///////////water ///////////
  void get_qte_water(){
      try{
        SimpleDateFormat tdate = new SimpleDateFormat("dd/MM/yyyy");
        String addDate = tdate.format(jDateChooser1.getDate()); System.out.print(addDate);
        jLabel8.setText(addDate);
        java.util.Date date;
        date = tdate.parse(addDate);
        java.sql.Date sqldate = new java.sql.Date(date.getTime());System.out.println("sql date drinks "+sqldate);
          String query = "select SUM(qte) as total, SUM(total) as totalwater from stats where drink ='"+water_soda.getSelectedItem()+"' and date='"+sqldate+"'";
          int tot;
          double tottaking;
          st=(Statement) cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while(rs.next()){
              tot=rs.getInt("total");System.out.print(tot);
              tottaking = rs.getDouble("totalwater");
              total_water.setText(""+tot);
              taking_water.setText(""+tottaking);
          }
      }catch(Exception e){
          //JOptionPane.showMessageDialog(rootPane, e);
      }
  }
  void get_qte_water_month (){
      try{ 
          int month = jMonthChooser1.getMonth()+1;System.out.println("Month date chooser "+month);
          int monthselect = get_month();
          int year = Year.now().getValue();
          String query = "select SUM(qte) as qtewater, SUM(total) as totalwater from stats where drink ='"+water_month.getSelectedItem()+"'  and EXTRACT(month from date) = '"+monthselect+"' and EXTRACT(year from date) = '"+year+"'";
          int totwatermonth;
          double totalwatermonth;
          st=(Statement) cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while(rs.next()){
              totwatermonth=rs.getInt("qtewater");System.out.print(totwatermonth);
              totalwatermonth = rs.getDouble("totalwater");
              total_water_month.setText(""+totwatermonth);
              taking_water_month.setText(""+totalwatermonth);
          }
      }catch(Exception e){
          //JOptionPane.showMessageDialog(rootPane, e);
  }
  }
  void get_qte_water_year (){
      try{ 
          int year = jYearChooser1.getYear();System.out.println("year from chhooser "+year);
          String query = "select SUM(qte) as qtewater, SUM(total) as totalwater from stats where drink ='"+water_year.getSelectedItem()+"'  and EXTRACT(year from date) = '"+year+"'";
          int totwateryear;
          double takingwateryear;
          st=(Statement) cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while(rs.next()){
              totwateryear=rs.getInt("qtewater");System.out.print(totwateryear);
              takingwateryear = rs.getDouble("totalwater");
              total_water_year.setText(""+totwateryear);
              taking_water_year.setText(""+takingwateryear);
          }
      }catch(Exception e){
          //JOptionPane.showMessageDialog(rootPane, e);
  }
  }
  ////////////crpes/////////////////////
  void get_qte_crepe(){
      try{
        SimpleDateFormat tdate = new SimpleDateFormat("dd/MM/yyyy");
        String addDate = tdate.format(jDateChooser1.getDate()); System.out.print(addDate);
        jLabel8.setText(addDate);
        java.util.Date date;
        date = tdate.parse(addDate);
        java.sql.Date sqldate = new java.sql.Date(date.getTime());System.out.println("sql date drinks "+sqldate);
          String query = "select SUM(qte) as qtecrepe, SUM(total) as totalcreps from stats where drink ='"+crépes.getSelectedItem()+"' and date='"+sqldate+"'";
          int tot;
          double tottaking;
          st=(Statement) cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while(rs.next()){
              tot=rs.getInt("qtecrepe");System.out.print(tot);
              tottaking = rs.getDouble("totalcreps");
              total_crepe.setText(""+tot);
              taking_crepe.setText(""+tottaking);
          }
      }catch(Exception e){
          //JOptionPane.showMessageDialog(rootPane, e);
      }
  }
  void get_qte_crepe_month (){
  try{ 
          int month = jMonthChooser1.getMonth()+1;System.out.println("Month date chooser "+month);
          int monthselect = get_month();
          int year = Year.now().getValue();
          String query = "select SUM(qte) as qtecrepemonth, SUM(total) as totalcrepemonth from stats where drink ='"+crépes_month.getSelectedItem()+"'  and EXTRACT(month from date) = '"+monthselect+"' and EXTRACT (year from date) = '"+year+"'";
          int totcrepemonth;
          double totalcrepemonth;
          st=(Statement) cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while(rs.next()){
              totcrepemonth=rs.getInt("qtecrepemonth");System.out.print(totcrepemonth);
              totalcrepemonth = rs.getDouble("totalcrepemonth");
              total_crepe_month.setText(""+totcrepemonth);
              taking_crepe_month.setText(""+totalcrepemonth);
          }
      }catch(Exception e){
          //JOptionPane.showMessageDialog(rootPane, e);
  }
  }
  void get_qte_crepe_year (){
  try{ 
          int year = jYearChooser1.getYear();System.out.println("Month date chooser "+year);
          String query = "select SUM(qte) as qtecrepemonth, SUM(total) as totalcrepemonth from stats where drink ='"+crépes_year.getSelectedItem()+"'  and EXTRACT(year from date) = '"+year+"'";
          int totcrepeyear;
          double takingcrepeyear;
          st=(Statement) cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while(rs.next()){
              totcrepeyear=rs.getInt("qtecrepemonth");
              takingcrepeyear = rs.getDouble("totalcrepemonth");
              total_crepe_year.setText(""+totcrepeyear);
              taking_crepe_year.setText(""+takingcrepeyear);
          }
      }catch(Exception e){
          //JOptionPane.showMessageDialog(rootPane, e);
  }
  }
  //////////////get qte jwajem ///////////////
  void get_qte_jwajem(){
      try{
        SimpleDateFormat tdate = new SimpleDateFormat("dd/MM/yyyy");
        String addDate = tdate.format(jDateChooser1.getDate()); System.out.print(addDate);
        jLabel8.setText(addDate);
        java.util.Date date;
        date = tdate.parse(addDate);
        java.sql.Date sqldate = new java.sql.Date(date.getTime());System.out.println("sql date drinks "+sqldate);
          String query = "select SUM(qte) as qtejwajem, SUM(total) as totaljwajem from stats where drink ='"+jwajem_day.getSelectedItem()+"' and date='"+sqldate+"'";
          int tot;
          double tottaking;
          st=(Statement) cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while(rs.next()){
              tot=rs.getInt("qtejwajem");System.out.print(tot);
              tottaking = rs.getDouble("totaljwajem");
              total_jwajem.setText(""+tot);
              taking_jwajem.setText(""+tottaking);
          }
      }catch(Exception e){
          //JOptionPane.showMessageDialog(rootPane, e);
      }
  }
  void get_qte_jwajem_month (){
  try{ 
          int month = jMonthChooser1.getMonth()+1;System.out.println("Month date chooser "+month);
          int monthselect = get_month();
          int year = Year.now().getValue();
          String query = "select SUM(qte) as qtejwajem, SUM(total) as totaljwajem from stats where drink ='"+jwajem_month.getSelectedItem()+"'  and EXTRACT(month from date) = '"+monthselect+"' and EXTRACT (year from date) = '"+year+"'";
          int totjwajemmonth;
          double totaljwajemmonth;
          st=(Statement) cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while(rs.next()){
              totjwajemmonth=rs.getInt("qtejwajem");System.out.print(totjwajemmonth);
              totaljwajemmonth = rs.getDouble("totaljwajem");
              total_jwajem_mounth.setText(""+totjwajemmonth);
              taking_jwajem_month.setText(""+totaljwajemmonth);
          }
      }catch(Exception e){
          //JOptionPane.showMessageDialog(rootPane, e);
  }
  }
  void get_qte_jwajem_year (){
  try{ 
          int year = jYearChooser1.getYear();
          String query = "select SUM(qte) as qtejwajem, SUM(total) as totaljwajem from stats where drink ='"+jwajem_year.getSelectedItem()+"'  and EXTRACT(year from date) = '"+year+"'";
          int totjwajemyear;
          double totaljwajemyear;
          st=(Statement) cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while(rs.next()){
              totjwajemyear=rs.getInt("qtejwajem");System.out.print(totjwajemyear);
              totaljwajemyear = rs.getDouble("totaljwajem");
              total_jwajem_year.setText(""+totjwajemyear);
              taking_jwajem_year.setText(""+totaljwajemyear);
          }
      }catch(Exception e){
          //JOptionPane.showMessageDialog(rootPane, e);
  }
  }
  ////////////get qte for juce/////////////
  void get_qte_juce(){
      try{
        SimpleDateFormat tdate = new SimpleDateFormat("dd/MM/yyyy");
        String addDate = tdate.format(jDateChooser1.getDate()); System.out.print(addDate);
        jLabel8.setText(addDate);
        java.util.Date date;
        date = tdate.parse(addDate);
        java.sql.Date sqldate = new java.sql.Date(date.getTime());System.out.println("sql date drinks "+sqldate);
          String query = "select SUM(qte) as total, SUM(total) as totaljuce from stats where drink ='"+juce.getSelectedItem()+"' and date='"+sqldate+"'";
          int tot;
          double tottaking;
          st=(Statement) cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while(rs.next()){
              tot=rs.getInt("total");System.out.print(tot);
              tottaking = rs.getDouble("totaljuce");
              total_juce.setText(""+tot);
              taking_juce.setText(""+tottaking);
          }
      }catch(Exception e){
          //JOptionPane.showMessageDialog(rootPane, e);
      }
  }
  void get_qte_juce_month (){
  try{ 
          int month = jMonthChooser1.getMonth()+1;System.out.println("Month date chooser "+month);
          int monthselect = get_month();
          int year = Year.now().getValue();
          String query = "select SUM(qte) as qtejuce, SUM(total) as totaljuce from stats where drink ='"+juce_month.getSelectedItem()+"'  and EXTRACT(month from date) = '"+monthselect+"' and EXTRACT (year from date) = '"+year+"'";
          int totjucemonth;
          double totaljucemonth;
          st=(Statement) cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while(rs.next()){
              totjucemonth=rs.getInt("qtejuce");System.out.print(totjucemonth);
              totaljucemonth = rs.getDouble("totaljuce");
              total_juce_month.setText(""+totjucemonth);
              taking_juce_month.setText(""+totaljucemonth);
          }
      }catch(Exception e){
          //JOptionPane.showMessageDialog(rootPane, e);
  }
  }
  void get_qte_juce_year (){
  try{ 
          int year = jYearChooser1.getYear();
          String query = "select SUM(qte) as qtejuce, SUM(total) as totaljuce from stats where drink ='"+juce_year.getSelectedItem()+"'  and EXTRACT(year from date) = '"+year+"'";
          int totjuceyear;
          double takingjuceyear;
          st=(Statement) cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while(rs.next()){
              totjuceyear=rs.getInt("qtejuce");
              takingjuceyear = rs.getDouble("totaljuce");
              total_juce_year.setText(""+totjuceyear);
              taking_juce_year.setText(""+takingjuceyear);
          }
      }catch(Exception e){
          //JOptionPane.showMessageDialog(rootPane, e);
  }
  }
  void get_qte_hookah(){
      try{
        SimpleDateFormat tdate = new SimpleDateFormat("dd/MM/yyyy");
        String addDate = tdate.format(jDateChooser1.getDate()); System.out.print(addDate);
        jLabel8.setText(addDate);
        java.util.Date date;
        date = tdate.parse(addDate);
        java.sql.Date sqldate = new java.sql.Date(date.getTime());System.out.println("sql date drinks "+sqldate);
          String query = "select SUM(qte) as total, SUM(total) as totalhookah from stats where drink ='"+hookah.getSelectedItem()+"' and date='"+sqldate+"'";
          int tot;
          double tottaking;
          st=(Statement) cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while(rs.next()){
              tot=rs.getInt("total");System.out.print(tot);
              tottaking = rs.getDouble("totalhookah");
              total_hookah.setText(""+tot);
              taking_hookah.setText(""+tottaking);
          }
      }catch(Exception e){
          //JOptionPane.showMessageDialog(rootPane, e);
      }
  }
  void get_qte_hookah_month (){
  try{ 
          int month = jMonthChooser1.getMonth()+1;System.out.println("Month date chooser "+month);
          int monthselect = get_month();
          int year = Year.now().getValue();
          String query = "select SUM(qte) as qtehookah, SUM(total) as totalhookah from stats where drink ='"+hookah_month.getSelectedItem()+"'  and EXTRACT(month from date) = '"+monthselect+"' and EXTRACT (year from date ) = '"+year+"'";
          int tot_hookah_month;
          double totalhookah_month;
          st=(Statement) cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while(rs.next()){
              tot_hookah_month=rs.getInt("qtehookah");System.out.print(tot_hookah_month);
              totalhookah_month = rs.getDouble("totalhookah");
              total_hookah_month.setText(""+tot_hookah_month);
              taking_hookah_month.setText(""+totalhookah_month);
          }
      }catch(Exception e){
          //JOptionPane.showMessageDialog(rootPane, e);
  }
  }
  void get_qte_hookah_year (){
  try{ 
          int year = jYearChooser1.getYear();System.out.println(year);
          String query = "select SUM(qte) as qtehookah, SUM(total) as totalhookah from stats where drink ='"+hookah_year.getSelectedItem()+"'  and EXTRACT(year from date) = '"+year+"'";
          int tot_hookah_year;
          double takinghookahyear;
          st=(Statement) cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while(rs.next()){
              tot_hookah_year=rs.getInt("qtehookah");
              takinghookahyear = rs.getDouble("totalhookah");
              total_hookah_year.setText(""+tot_hookah_year);
              taking_hookah_year.setText(""+takinghookahyear);
          }
      }catch(Exception e){
          //JOptionPane.showMessageDialog(rootPane, e);
  }
  }
  void get_qte_food(){
      try{
        SimpleDateFormat tdate = new SimpleDateFormat("dd/MM/yyyy");
        String addDate = tdate.format(jDateChooser1.getDate()); System.out.print(addDate);
        jLabel8.setText(addDate);
        java.util.Date date;
        date = tdate.parse(addDate);
        java.sql.Date sqldate = new java.sql.Date(date.getTime());System.out.println("sql date drinks "+sqldate);
          String query = "select SUM(qte) as totalqte, SUM(total) as totaltaking  from stats where drink ='"+délice.getSelectedItem()+"' and date='"+sqldate+"'";
          int tot;
          double tottaking;
          st=(Statement) cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while(rs.next()){
              tot=rs.getInt("totalqte");System.out.println(tot);
              tottaking=rs.getInt("totaltaking");System.out.println(tottaking);
              total_food.setText(""+tot);
              taking_food.setText(""+tottaking);
          }
      }catch(Exception e){
          //JOptionPane.showMessageDialog(rootPane, e);
      }
  }
  void get_qte_food_month (){
  try{ 
          int month = jMonthChooser1.getMonth()+1;System.out.println("Month date chooser "+month);
          int monthselect = get_month();
          int year = Year.now().getValue();
          String query = "select SUM(qte) as qtefood, SUM(total) as totalfood from stats where drink ='"+délice_month.getSelectedItem()+"'  and EXTRACT(month from date) = '"+monthselect+"' and EXTRACT(year from date) = '"+year+"'";
          int totfoodmonth;
          double totalfoodmonth;
          st=(Statement) cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while(rs.next()){
              totfoodmonth=rs.getInt("qtefood");System.out.print(totfoodmonth);
              totalfoodmonth = rs.getDouble("totalfood");
              total_food_month.setText(""+totfoodmonth);
              taking_food_month.setText(""+totalfoodmonth);
          }
      }catch(Exception e){
          //JOptionPane.showMessageDialog(rootPane, e);
  }
  }
  void get_qte_food_year (){
  try{ 
          int year = jYearChooser1.getYear();
          String query = "select SUM(qte) as qtefood, SUM(total) as totalfood from stats where drink ='"+délice_year.getSelectedItem()+"'  and EXTRACT(year from date) = '"+year+"'";
          int totfoodyear;
          double takingfoodyear;
          st=(Statement) cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while(rs.next()){
              totfoodyear=rs.getInt("qtefood");
              takingfoodyear = rs.getDouble("totalfood");
              total_food_year.setText(""+totfoodyear);
              taking_food_year.setText(""+takingfoodyear);
          }
      }catch(Exception e){
          //JOptionPane.showMessageDialog(rootPane, e);
  }
  }
  void get_stats_month (){
      try{
        int month = jMonthChooser1.getMonth()+1;System.out.println("Month date chooser "+month);
        int monthselect = get_month();
        int year = Year.now().getValue();System.out.println("Cuurent year "+year);
          DefaultTableModel table=(DefaultTableModel) jTable1.getModel();
          String query = "select drink, qte, total, date, time from stats where EXTRACT(month from date) = '"+month+"' and EXTRACT(year from date) ='"+year+"'";
          st=cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                table.addRow(new Object[] {rs.getString("drink"),rs.getString("qte"),rs.getString("total"),rs.getString("date"),rs.getString("time")});
            }
      }catch(Exception e){
          JOptionPane.showMessageDialog(rootPane, e);
      }
  }
  void get_stats_year (){
      try{
        int year = jYearChooser1.getYear();
          DefaultTableModel table=(DefaultTableModel) jTable1.getModel();
          String query = "select drink, qte, total, date, time from stats where EXTRACT(year from date) = '"+year+"'";
          st=cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                table.addRow(new Object[] {rs.getString("drink"),rs.getString("qte"),rs.getString("total"),rs.getString("date"),rs.getString("time")});
            }
      }catch(Exception e){
          JOptionPane.showMessageDialog(rootPane, e);
      }
  }
  void get_stats (){
      try{
        String date_txt = jLabel8.getText();System.out.println(date_txt);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date date;
        date = sdf1.parse(date_txt);
        java.sql.Date sqldate = new java.sql.Date(date.getTime());System.out.println("sql date "+sqldate);
          DefaultTableModel table=(DefaultTableModel) jTable1.getModel();
          String query = "select drink, qte, total, date, time, name_waiter from stats where date = '"+sqldate+"'";
          st=cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                table.addRow(new Object[] {rs.getString("drink"),rs.getString("qte"),rs.getString("total"),rs.getString("date"),rs.getString("time"),rs.getString("name_waiter")});
            }
      }catch(Exception e){
          JOptionPane.showMessageDialog(rootPane, e);
      }
      
  }
  void get_total_month (){
      try{
          int month = jMonthChooser1.getMonth()+1;System.out.println("Month date chooser "+month);
          int monthselect = get_month();
          DefaultTableModel table=(DefaultTableModel) jTable1.getModel();
          double tot;
          String query = "select SUM(total) as tot from stats where EXTRACT(month from date) = '"+month+"'";
          st=cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while (rs.next()){
              tot = rs.getDouble("tot");
              total_taking.setText(""+tot);
          }
      }catch(Exception e){
          JOptionPane.showMessageDialog(rootPane, e);
      }
  }
  void get_total_year (){
      try{
          int year = jYearChooser1.getYear();
          DefaultTableModel table=(DefaultTableModel) jTable1.getModel();
          double tot;
          String query = "select SUM(total) as tot from stats where EXTRACT(year from date) = '"+year+"'";
          st=cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while (rs.next()){
              tot = rs.getDouble("tot");
              total_taking.setText(""+tot);
          }
      }catch(Exception e){
          JOptionPane.showMessageDialog(rootPane, e);
      }
  }
  void get_total_day(){
      try{
          String date_txt = jLabel8.getText();System.out.println(date_txt);
          SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date date;
        date = sdf1.parse(date_txt);
        java.sql.Date sqldate = new java.sql.Date(date.getTime());System.out.println("sql date "+sqldate);
          double tot;
          String query = "select SUM(total) as tot from stats where date = '"+sqldate+"'";
          st=cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while (rs.next()){
              tot = rs.getDouble("tot");
              total_taking.setText(""+tot);
          }
      }catch(Exception e){
          JOptionPane.showMessageDialog(rootPane, e);
      }
  }
  void getmonth(){
      try{
        String query = "select date from orders2";
          st=cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while (rs.next()){
              String date = rs.getString("date");
              String mth = date.substring(3, 5);
              System.out.println(date);
              System.out.println(mth);
          }
      }catch(Exception e){
          JOptionPane.showMessageDialog(rootPane, e);
      }
  }
  int selected_month;
  int get_month(){
      try{
          int month_date = jMonthChooser1.getMonth()+1;
          String query ="select month (date) as month from stats where month (date)='"+month_date+"'";
          st=cnx.obtenircon().createStatement();
          ResultSet rs=st.executeQuery(query);
          while (rs.next()){
              selected_month = rs.getInt("month");System.out.println("get month "+selected_month);
          }
      }catch(Exception e){
          JOptionPane.showMessageDialog(rootPane, e);
      }
      return selected_month;
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        date_label = new javax.swing.JLabel();
        time_label = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        water_soda = new javax.swing.JComboBox<>();
        hookah = new javax.swing.JComboBox<>();
        drinks = new javax.swing.JComboBox<>();
        délice = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        total_drinks = new javax.swing.JLabel();
        total_water = new javax.swing.JLabel();
        total_hookah = new javax.swing.JLabel();
        total_food = new javax.swing.JLabel();
        taking_food = new javax.swing.JLabel();
        taking_drinks = new javax.swing.JLabel();
        taking_water = new javax.swing.JLabel();
        taking_hookah = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        total_taking = new javax.swing.JLabel();
        total_taking1 = new javax.swing.JLabel();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jLabel9 = new javax.swing.JLabel();
        juce = new javax.swing.JComboBox<>();
        total_juce = new javax.swing.JLabel();
        taking_juce = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        crépes = new javax.swing.JComboBox<>();
        total_crepe = new javax.swing.JLabel();
        taking_crepe = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        drinks_month = new javax.swing.JComboBox<>();
        total_drinks_month = new javax.swing.JLabel();
        taking_drinks_month = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        water_month = new javax.swing.JComboBox<>();
        total_water_month = new javax.swing.JLabel();
        taking_water_month = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        hookah_month = new javax.swing.JComboBox<>();
        total_hookah_month = new javax.swing.JLabel();
        taking_hookah_month = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        juce_month = new javax.swing.JComboBox<>();
        total_juce_month = new javax.swing.JLabel();
        taking_juce_month = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        délice_month = new javax.swing.JComboBox<>();
        total_food_month = new javax.swing.JLabel();
        taking_food_month = new javax.swing.JLabel();
        total_crepe_month = new javax.swing.JLabel();
        taking_crepe_month = new javax.swing.JLabel();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jLabel17 = new javax.swing.JLabel();
        drinks_year = new javax.swing.JComboBox<>();
        total_drinks_year = new javax.swing.JLabel();
        taking_drinks_year = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        water_year = new javax.swing.JComboBox<>();
        total_water_year = new javax.swing.JLabel();
        taking_water_year = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        hookah_year = new javax.swing.JComboBox<>();
        total_hookah_year = new javax.swing.JLabel();
        taking_hookah_year = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        juce_year = new javax.swing.JComboBox<>();
        total_juce_year = new javax.swing.JLabel();
        taking_juce_year = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        délice_year = new javax.swing.JComboBox<>();
        total_food_year = new javax.swing.JLabel();
        taking_food_year = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        crépes_year = new javax.swing.JComboBox<>();
        total_crepe_year = new javax.swing.JLabel();
        taking_crepe_year = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        crépes_month = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jwajem_day = new javax.swing.JComboBox<>();
        jwajem_month = new javax.swing.JComboBox<>();
        jwajem_year = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        total_jwajem = new javax.swing.JLabel();
        taking_jwajem = new javax.swing.JLabel();
        total_jwajem_mounth = new javax.swing.JLabel();
        taking_jwajem_month = new javax.swing.JLabel();
        total_jwajem_year = new javax.swing.JLabel();
        taking_jwajem_year = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calm Street Coffeeshop - Stats -POS developed by Bouzidi Imed - Whatsapp: 54058988");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Old English Text MT", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Calm Street Coffeeshop");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Stats");

        date_label.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        date_label.setForeground(new java.awt.Color(255, 255, 255));
        date_label.setText("Date");

        time_label.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        time_label.setForeground(new java.awt.Color(255, 255, 255));
        time_label.setText("Time");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(date_label, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time_label, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(date_label)
                        .addComponent(time_label)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Eau/Canette");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Hookah");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Date");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Délices");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("cafés");

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jDateChooser1.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Get stats day");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        water_soda.setBackground(new java.awt.Color(255, 255, 255));
        water_soda.setForeground(new java.awt.Color(0, 0, 0));
        water_soda.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        water_soda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                water_sodaActionPerformed(evt);
            }
        });

        hookah.setBackground(new java.awt.Color(255, 255, 255));
        hookah.setForeground(new java.awt.Color(0, 0, 0));
        hookah.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        hookah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hookahActionPerformed(evt);
            }
        });

        drinks.setBackground(new java.awt.Color(255, 255, 255));
        drinks.setForeground(new java.awt.Color(0, 0, 0));
        drinks.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        drinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinksActionPerformed(evt);
            }
        });

        délice.setBackground(new java.awt.Color(255, 255, 255));
        délice.setForeground(new java.awt.Color(0, 0, 0));
        délice.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        délice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                déliceActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Reset year");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        total_drinks.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        total_drinks.setForeground(new java.awt.Color(0, 0, 0));
        total_drinks.setText("0");

        total_water.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        total_water.setForeground(new java.awt.Color(0, 0, 0));
        total_water.setText("0");

        total_hookah.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        total_hookah.setForeground(new java.awt.Color(0, 0, 0));
        total_hookah.setText("0");

        total_food.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        total_food.setForeground(new java.awt.Color(0, 0, 0));
        total_food.setText("0");

        taking_food.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        taking_food.setForeground(new java.awt.Color(0, 0, 0));
        taking_food.setText("0");

        taking_drinks.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        taking_drinks.setForeground(new java.awt.Color(0, 0, 0));
        taking_drinks.setText("0");

        taking_water.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        taking_water.setForeground(new java.awt.Color(0, 0, 0));
        taking_water.setText("0");

        taking_hookah.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        taking_hookah.setForeground(new java.awt.Color(0, 0, 0));
        taking_hookah.setText("0");

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drink", "Quantity", "Total", "Date", "Time", "Waiter"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        total_taking.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        total_taking.setForeground(new java.awt.Color(0, 0, 0));

        total_taking1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        total_taking1.setForeground(new java.awt.Color(0, 0, 0));
        total_taking1.setText("Total taking ");

        jMonthChooser1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jMonthChooser1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Jus");

        juce.setBackground(new java.awt.Color(255, 255, 255));
        juce.setForeground(new java.awt.Color(0, 0, 0));
        juce.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        juce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juceActionPerformed(evt);
            }
        });

        total_juce.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        total_juce.setForeground(new java.awt.Color(0, 0, 0));
        total_juce.setText("0");

        taking_juce.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        taking_juce.setForeground(new java.awt.Color(0, 0, 0));
        taking_juce.setText("0");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Crépes");

        crépes.setBackground(new java.awt.Color(255, 255, 255));
        crépes.setForeground(new java.awt.Color(0, 0, 0));
        crépes.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        crépes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crépesActionPerformed(evt);
            }
        });

        total_crepe.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        total_crepe.setForeground(new java.awt.Color(0, 0, 0));
        total_crepe.setText("0");

        taking_crepe.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        taking_crepe.setForeground(new java.awt.Color(0, 0, 0));
        taking_crepe.setText("0");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("cafés");

        drinks_month.setBackground(new java.awt.Color(255, 255, 255));
        drinks_month.setForeground(new java.awt.Color(0, 0, 0));
        drinks_month.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        drinks_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinks_monthActionPerformed(evt);
            }
        });

        total_drinks_month.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        total_drinks_month.setForeground(new java.awt.Color(0, 0, 0));
        total_drinks_month.setText("0");

        taking_drinks_month.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        taking_drinks_month.setForeground(new java.awt.Color(0, 0, 0));
        taking_drinks_month.setText("0");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Eau minéral");

        water_month.setBackground(new java.awt.Color(255, 255, 255));
        water_month.setForeground(new java.awt.Color(0, 0, 0));
        water_month.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        water_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                water_monthActionPerformed(evt);
            }
        });

        total_water_month.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        total_water_month.setForeground(new java.awt.Color(0, 0, 0));
        total_water_month.setText("0");

        taking_water_month.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        taking_water_month.setForeground(new java.awt.Color(0, 0, 0));
        taking_water_month.setText("0");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Hookah");

        hookah_month.setBackground(new java.awt.Color(255, 255, 255));
        hookah_month.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        hookah_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hookah_monthActionPerformed(evt);
            }
        });

        total_hookah_month.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        total_hookah_month.setForeground(new java.awt.Color(0, 0, 0));
        total_hookah_month.setText("0");

        taking_hookah_month.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        taking_hookah_month.setForeground(new java.awt.Color(0, 0, 0));
        taking_hookah_month.setText("0");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Jus");

        juce_month.setBackground(new java.awt.Color(255, 255, 255));
        juce_month.setForeground(new java.awt.Color(0, 0, 0));
        juce_month.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        juce_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juce_monthActionPerformed(evt);
            }
        });

        total_juce_month.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        total_juce_month.setForeground(new java.awt.Color(0, 0, 0));
        total_juce_month.setText("0");

        taking_juce_month.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        taking_juce_month.setForeground(new java.awt.Color(0, 0, 0));
        taking_juce_month.setText("0");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Délices");

        délice_month.setBackground(new java.awt.Color(255, 255, 255));
        délice_month.setForeground(new java.awt.Color(0, 0, 0));
        délice_month.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        délice_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                délice_monthActionPerformed(evt);
            }
        });

        total_food_month.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        total_food_month.setForeground(new java.awt.Color(0, 0, 0));
        total_food_month.setText("0");

        taking_food_month.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        taking_food_month.setForeground(new java.awt.Color(0, 0, 0));
        taking_food_month.setText("0");

        total_crepe_month.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        total_crepe_month.setForeground(new java.awt.Color(0, 0, 0));
        total_crepe_month.setText("0");

        taking_crepe_month.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        taking_crepe_month.setForeground(new java.awt.Color(0, 0, 0));
        taking_crepe_month.setText("0");

        jYearChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jYearChooser1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("cafés");

        drinks_year.setBackground(new java.awt.Color(255, 255, 255));
        drinks_year.setForeground(new java.awt.Color(0, 0, 0));
        drinks_year.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        drinks_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinks_yearActionPerformed(evt);
            }
        });

        total_drinks_year.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        total_drinks_year.setForeground(new java.awt.Color(0, 0, 0));
        total_drinks_year.setText("0");

        taking_drinks_year.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        taking_drinks_year.setForeground(new java.awt.Color(0, 0, 0));
        taking_drinks_year.setText("0");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Eau minéral");

        water_year.setBackground(new java.awt.Color(255, 255, 255));
        water_year.setForeground(new java.awt.Color(0, 0, 0));
        water_year.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        water_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                water_yearActionPerformed(evt);
            }
        });

        total_water_year.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        total_water_year.setForeground(new java.awt.Color(0, 0, 0));
        total_water_year.setText("0");

        taking_water_year.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        taking_water_year.setForeground(new java.awt.Color(0, 0, 0));
        taking_water_year.setText("0");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Hookah");

        hookah_year.setBackground(new java.awt.Color(255, 255, 255));
        hookah_year.setForeground(new java.awt.Color(0, 0, 0));
        hookah_year.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        hookah_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hookah_yearActionPerformed(evt);
            }
        });

        total_hookah_year.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        total_hookah_year.setForeground(new java.awt.Color(0, 0, 0));
        total_hookah_year.setText("0");

        taking_hookah_year.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        taking_hookah_year.setForeground(new java.awt.Color(0, 0, 0));
        taking_hookah_year.setText("0");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Jus");

        juce_year.setBackground(new java.awt.Color(255, 255, 255));
        juce_year.setForeground(new java.awt.Color(0, 0, 0));
        juce_year.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        juce_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juce_yearActionPerformed(evt);
            }
        });

        total_juce_year.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        total_juce_year.setForeground(new java.awt.Color(0, 0, 0));
        total_juce_year.setText("0");

        taking_juce_year.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        taking_juce_year.setForeground(new java.awt.Color(0, 0, 0));
        taking_juce_year.setText("0");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Délices");

        délice_year.setBackground(new java.awt.Color(255, 255, 255));
        délice_year.setForeground(new java.awt.Color(0, 0, 0));
        délice_year.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        délice_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                délice_yearActionPerformed(evt);
            }
        });

        total_food_year.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        total_food_year.setForeground(new java.awt.Color(0, 0, 0));
        total_food_year.setText("0");

        taking_food_year.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        taking_food_year.setForeground(new java.awt.Color(0, 0, 0));
        taking_food_year.setText("0");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Crépes");

        crépes_year.setBackground(new java.awt.Color(255, 255, 255));
        crépes_year.setForeground(new java.awt.Color(0, 0, 0));
        crépes_year.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        crépes_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crépes_yearActionPerformed(evt);
            }
        });

        total_crepe_year.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        total_crepe_year.setForeground(new java.awt.Color(0, 0, 0));
        total_crepe_year.setText("0");

        taking_crepe_year.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        taking_crepe_year.setForeground(new java.awt.Color(0, 0, 0));
        taking_crepe_year.setText("0");

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Get stats of the year");
        jButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Crépes");

        crépes_month.setBackground(new java.awt.Color(255, 255, 255));
        crépes_month.setForeground(new java.awt.Color(0, 0, 0));
        crépes_month.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        crépes_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crépes_monthActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Reset day");
        jButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("Reset month");
        jButton6.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Get stats month");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Jwajem");

        jwajem_day.setBackground(new java.awt.Color(255, 255, 255));
        jwajem_day.setForeground(new java.awt.Color(0, 0, 0));
        jwajem_day.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jwajem_day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jwajem_dayActionPerformed(evt);
            }
        });

        jwajem_month.setBackground(new java.awt.Color(255, 255, 255));
        jwajem_month.setForeground(new java.awt.Color(0, 0, 0));
        jwajem_month.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jwajem_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jwajem_monthActionPerformed(evt);
            }
        });

        jwajem_year.setBackground(new java.awt.Color(255, 255, 255));
        jwajem_year.setForeground(new java.awt.Color(0, 0, 0));
        jwajem_year.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jwajem_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jwajem_yearActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Jwajem");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Jwajem");

        total_jwajem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        total_jwajem.setForeground(new java.awt.Color(0, 0, 0));
        total_jwajem.setText("0");

        taking_jwajem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        taking_jwajem.setForeground(new java.awt.Color(0, 0, 0));
        taking_jwajem.setText("0");

        total_jwajem_mounth.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        total_jwajem_mounth.setForeground(new java.awt.Color(0, 0, 0));
        total_jwajem_mounth.setText("0");

        taking_jwajem_month.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        taking_jwajem_month.setForeground(new java.awt.Color(0, 0, 0));
        taking_jwajem_month.setText("0");

        total_jwajem_year.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        total_jwajem_year.setForeground(new java.awt.Color(0, 0, 0));
        total_jwajem_year.setText("0");

        taking_jwajem_year.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        taking_jwajem_year.setForeground(new java.awt.Color(0, 0, 0));
        taking_jwajem_year.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(781, 781, 781)
                                .addComponent(taking_jwajem_month, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(total_taking1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(total_taking, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 13, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(water_soda, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(total_water, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(taking_water, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel12)
                                                        .addGap(24, 24, 24)
                                                        .addComponent(water_month, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(hookah_month, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(juce_month, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(délice_month, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jwajem_month, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(crépes_month, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(total_juce_month, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(total_water_month, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(total_hookah_month, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(total_crepe_month, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(total_jwajem_mounth, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(total_food_month, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(drinks, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(total_drinks, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(taking_drinks, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(111, 111, 111)
                                                        .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, Short.MAX_VALUE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(40, 40, 40)
                                                        .addComponent(drinks_month, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                                        .addComponent(total_drinks_month, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(2, 2, 2))))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(169, 169, 169)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(crépes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(délice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(juce, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(hookah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jwajem_day, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(total_jwajem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(total_juce, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(total_hookah, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(total_food, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(total_crepe, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(taking_juce, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(taking_hookah, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(23, 23, 23)
                                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(taking_food, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(taking_crepe, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(taking_jwajem, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(27, 27, 27)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(101, 101, 101)
                                                .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(2, 2, 2)
                                                        .addComponent(taking_hookah_month, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(taking_food_month, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(taking_crepe_month, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(taking_juce_month, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(crépes_year, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(juce_year, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(délice_year, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jwajem_year, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(hookah_year, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(water_year, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(total_water_year, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(taking_water_year, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(total_crepe_year, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(taking_crepe_year, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(total_food_year, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(taking_food_year, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(total_juce_year, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(taking_juce_year, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(total_hookah_year, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(taking_hookah_year, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(total_jwajem_year, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(taking_jwajem_year, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(taking_drinks_month, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(111, 111, 111)
                                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(taking_water_month, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(111, 111, 111)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel18)
                                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(193, 193, 193)
                                                .addComponent(total_drinks_year, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(316, 316, 316)
                                                .addComponent(drinks_year, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(taking_drinks_year, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jMonthChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jYearChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(drinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total_drinks)
                            .addComponent(taking_drinks)
                            .addComponent(jLabel11)
                            .addComponent(drinks_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total_drinks_month)
                            .addComponent(taking_drinks_month))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(water_soda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total_water)
                            .addComponent(taking_water)
                            .addComponent(jLabel12)
                            .addComponent(water_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total_water_month)
                            .addComponent(taking_water_month))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(hookah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total_hookah)
                            .addComponent(taking_hookah)
                            .addComponent(jLabel19)
                            .addComponent(hookah_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total_hookah_month)
                            .addComponent(taking_hookah_month)
                            .addComponent(jLabel13)
                            .addComponent(hookah_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total_hookah_year)
                            .addComponent(taking_hookah_year))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(juce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total_juce)
                            .addComponent(taking_juce)
                            .addComponent(jLabel20)
                            .addComponent(juce_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total_juce_month, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taking_juce_month)
                            .addComponent(jLabel14)
                            .addComponent(juce_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total_juce_year, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taking_juce_year))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(délice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total_food)
                            .addComponent(taking_food)
                            .addComponent(jLabel21)
                            .addComponent(jLabel15)
                            .addComponent(délice_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total_food_year)
                            .addComponent(taking_food_year)
                            .addComponent(total_food_month)
                            .addComponent(taking_food_month)
                            .addComponent(délice_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(crépes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total_crepe)
                            .addComponent(taking_crepe)
                            .addComponent(jLabel16)
                            .addComponent(jLabel22)
                            .addComponent(crépes_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total_crepe_year)
                            .addComponent(taking_crepe_year)
                            .addComponent(total_crepe_month)
                            .addComponent(taking_crepe_month)
                            .addComponent(crépes_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(drinks_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(total_drinks_year)
                                .addComponent(taking_drinks_year)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(water_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total_water_year)
                            .addComponent(taking_water_year))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jwajem_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(total_jwajem))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jwajem_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jwajem_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25)
                        .addComponent(total_jwajem_year)
                        .addComponent(taking_jwajem_year))
                    .addComponent(taking_jwajem)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(total_jwajem_mounth)
                        .addComponent(taking_jwajem_month)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total_taking1)
                    .addComponent(total_taking, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean test = check_date();
        if (test=false){
            JOptionPane.showMessageDialog(rootPane, "Select a date ");
        }else{
          DefaultTableModel table=(DefaultTableModel) jTable1.getModel();
          SimpleDateFormat tdate = new SimpleDateFormat("dd/MM/yyyy");
          String addDate = tdate.format(jDateChooser1.getDate()); System.out.print(addDate);
          jLabel8.setText(addDate);
          get_qte_drinks();get_qte_water();get_qte_hookah();get_qte_food();get_qte_juce();get_qte_crepe();
          table.setRowCount(0);
          get_stats();
          get_total_day();
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void drinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinksActionPerformed
        get_qte_drinks();
    }//GEN-LAST:event_drinksActionPerformed

    private void water_sodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_water_sodaActionPerformed
        get_qte_water();
    }//GEN-LAST:event_water_sodaActionPerformed

    private void hookahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hookahActionPerformed
        get_qte_hookah();
    }//GEN-LAST:event_hookahActionPerformed

    private void déliceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_déliceActionPerformed
        get_qte_food();
    }//GEN-LAST:event_déliceActionPerformed

    private void juceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juceActionPerformed
        get_qte_juce();
    }//GEN-LAST:event_juceActionPerformed

    private void crépesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crépesActionPerformed
        get_qte_crepe();
    }//GEN-LAST:event_crépesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel table;
        table = (DefaultTableModel) (jTable1.getModel());
        int res = JOptionPane.showConfirmDialog(rootPane, "Proceed operation ?");
        if (res==0){
            try{
          int year = jYearChooser1.getYear();System.out.println("Year from chooser "+year);
            String query ="delete from stats where EXTRACT(year from date) = '"+year+"'";
            st=(Statement) cnx.obtenircon().createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(rootPane, "Done");
            get_qte_drinks_year();
         get_qte_water_year();
         get_qte_hookah_year();
         get_qte_food_year();
         get_qte_juce_year();
         get_qte_crepe_year();
         get_stats_year ();
         get_total_year ();
         table.setRowCount(0);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Operation cancelled");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int month = jMonthChooser1.getMonth()+1;System.out.println("Month date chooser "+month);
        int monthselect = get_month();
        System.out.println("Selected month "+monthselect);
        DefaultTableModel table=(DefaultTableModel) jTable1.getModel();
          get_total_month();
          //int tot = Integer.parseInt(total_taking.getText());
          double tot = Double.parseDouble(total_taking.getText());
          if (0.0!=tot) {
         get_stats_month ();
         get_qte_drinks_month();
         get_qte_water_month();
         get_qte_hookah_month();
         get_qte_food_month();
         get_qte_juce_month();
         get_qte_crepe_month();
         get_qte_jwajem_month();
         //table.setRowCount(0); 
          }else{
          total_drinks_month.setText(""+0);taking_drinks_month.setText(""+0);
          total_water_month.setText(""+0);taking_water_month.setText(""+0);
          total_hookah_month.setText(""+0);taking_hookah_month.setText(""+0);
          total_juce_month.setText(""+0);taking_juce_month.setText(""+0);
          total_crepe_month.setText(""+0);taking_crepe_month.setText(""+0);
          total_food_month.setText(""+0);taking_food_month.setText(""+0);
          total_jwajem_mounth.setText(""+0);taking_jwajem_month.setText(""+0);
          table.setRowCount(0); 
          }     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void drinks_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinks_monthActionPerformed
            get_total_month();
            double tot = Double.parseDouble(total_taking.getText());
            if (0.0!=tot){
                get_qte_drinks_month();
            }
            else{
                total_drinks_month.setText(""+0);
                System.out.println("Empty");
            }
    }//GEN-LAST:event_drinks_monthActionPerformed

    private void water_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_water_monthActionPerformed
       get_total_month();
            double tot = Double.parseDouble(total_taking.getText());
            if (0.0!=tot){
                get_qte_water_month();
            }
            else{
                total_drinks_month.setText(""+0);
                System.out.println("Empty");
            }
        
    }//GEN-LAST:event_water_monthActionPerformed

    private void hookah_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hookah_monthActionPerformed
        get_total_month();
            double tot = Double.parseDouble(total_taking.getText());
            if (0.0!=tot){
                get_qte_hookah_month();
            }
            else{
                total_drinks_month.setText(""+0);
                System.out.println("Empty");
            }
        
    }//GEN-LAST:event_hookah_monthActionPerformed

    private void juce_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juce_monthActionPerformed
        get_total_month();
            double tot = Double.parseDouble(total_taking.getText());
            if (0.0!=tot){
                get_qte_juce_month();
            }
            else{
                total_drinks_month.setText(""+0);
                System.out.println("Empty");
            }
        
    }//GEN-LAST:event_juce_monthActionPerformed

    private void délice_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_délice_monthActionPerformed
         get_total_month();
            double tot = Double.parseDouble(total_taking.getText());
            if (0.0!=tot){
                get_qte_food_month();
            }
            else{
                total_drinks_month.setText(""+0);
                System.out.println("Empty");
            }
        
    }//GEN-LAST:event_délice_monthActionPerformed

    private void crépes_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crépes_monthActionPerformed
        get_total_month();
            double tot = Double.parseDouble(total_taking.getText());
            if (0.0!=tot){
                get_qte_crepe_month();
            }
            else{
                total_drinks_month.setText(""+0);
                System.out.println("Empty");
            }
        
    }//GEN-LAST:event_crépes_monthActionPerformed

    private void drinks_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinks_yearActionPerformed
        get_qte_drinks_year();
    }//GEN-LAST:event_drinks_yearActionPerformed

    private void water_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_water_yearActionPerformed
        get_qte_water_year();
    }//GEN-LAST:event_water_yearActionPerformed

    private void hookah_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hookah_yearActionPerformed
        get_qte_hookah_year();
    }//GEN-LAST:event_hookah_yearActionPerformed

    private void juce_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juce_yearActionPerformed
        get_qte_juce_year();
    }//GEN-LAST:event_juce_yearActionPerformed

    private void délice_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_délice_yearActionPerformed
        get_qte_food_year();
    }//GEN-LAST:event_délice_yearActionPerformed

    private void crépes_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crépes_yearActionPerformed
        get_qte_crepe_year();
    }//GEN-LAST:event_crépes_yearActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         int year = jYearChooser1.getYear();System.out.println("Month date chooser "+year);
         DefaultTableModel table=(DefaultTableModel) jTable1.getModel();
         get_qte_drinks_year();
         get_qte_water_year();
         get_qte_hookah_year();
         get_qte_food_year();
         get_qte_juce_year();
         get_qte_crepe_year();
         table.setRowCount(0);
         get_stats_year ();
         get_total_year ();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DefaultTableModel table;
        table = (DefaultTableModel) (jTable1.getModel());
        int res = JOptionPane.showConfirmDialog(rootPane, "Proceed operation ?");
        if (res==0){
            try{
            String date_txt = jLabel8.getText();System.out.println(date_txt);
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date date;
            date = sdf1.parse(date_txt);
            java.sql.Date sqldate = new java.sql.Date(date.getTime());System.out.println("sql date "+sqldate);
            String query ="delete from stats where date ='"+sqldate+"'";
            st=(Statement) cnx.obtenircon().createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(rootPane, "Done");
            table.setRowCount(0);
            get_qte_drinks();get_qte_water();get_qte_hookah();get_qte_food();get_qte_juce();get_qte_crepe();
            get_total_day();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Operation cancelled");
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed
    boolean check_date (){
        boolean test = false;
        //String date_txt = jLabel8.getText();System.out.println(date_txt);
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date date;
        date = jDateChooser1.getDate();
        
        if (date==null){JOptionPane.showMessageDialog(rootPane, "Select a date ");}
        java.sql.Date sqldate = new java.sql.Date(date.getTime());
        System.out.println("sql date "+sqldate);
        if (sqldate==null){
            JOptionPane.showMessageDialog(rootPane, "Select a date ");
            test = false;
        }else{
            test = true;
        }
        return test;
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DefaultTableModel table;
        table = (DefaultTableModel) (jTable1.getModel());
        int res = JOptionPane.showConfirmDialog(rootPane, "Proceed operation ?");
        if (res==0){
            try{
          int month = jMonthChooser1.getMonth()+1;System.out.println("Month date chooser "+month);
          int monthselect = get_month();
            String query ="delete from stats where EXTRACT(month from date) = '"+monthselect+"'";
            st=(Statement) cnx.obtenircon().createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(rootPane, "Done");
            table.setRowCount(0);
            get_total_month();
            get_qte_drinks_month();
         get_qte_water_month();
         get_qte_hookah_month();
         get_qte_food_month();
         get_qte_juce_month();
         get_qte_crepe_month();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Operation cancelled");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jwajem_dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jwajem_dayActionPerformed
        get_qte_jwajem();
    }//GEN-LAST:event_jwajem_dayActionPerformed

    private void jwajem_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jwajem_monthActionPerformed
        get_qte_jwajem_month();
    }//GEN-LAST:event_jwajem_monthActionPerformed

    private void jwajem_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jwajem_yearActionPerformed
        get_qte_jwajem_year ();
    }//GEN-LAST:event_jwajem_yearActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> crépes;
    private javax.swing.JComboBox<String> crépes_month;
    private javax.swing.JComboBox<String> crépes_year;
    private javax.swing.JLabel date_label;
    private javax.swing.JComboBox<String> drinks;
    private javax.swing.JComboBox<String> drinks_month;
    private javax.swing.JComboBox<String> drinks_year;
    private javax.swing.JComboBox<String> délice;
    private javax.swing.JComboBox<String> délice_month;
    private javax.swing.JComboBox<String> délice_year;
    private javax.swing.JComboBox<String> hookah;
    private javax.swing.JComboBox<String> hookah_month;
    private javax.swing.JComboBox<String> hookah_year;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JComboBox<String> juce;
    private javax.swing.JComboBox<String> juce_month;
    private javax.swing.JComboBox<String> juce_year;
    private javax.swing.JComboBox<String> jwajem_day;
    private javax.swing.JComboBox<String> jwajem_month;
    private javax.swing.JComboBox<String> jwajem_year;
    private javax.swing.JLabel taking_crepe;
    private javax.swing.JLabel taking_crepe_month;
    private javax.swing.JLabel taking_crepe_year;
    private javax.swing.JLabel taking_drinks;
    private javax.swing.JLabel taking_drinks_month;
    private javax.swing.JLabel taking_drinks_year;
    private javax.swing.JLabel taking_food;
    private javax.swing.JLabel taking_food_month;
    private javax.swing.JLabel taking_food_year;
    private javax.swing.JLabel taking_hookah;
    private javax.swing.JLabel taking_hookah_month;
    private javax.swing.JLabel taking_hookah_year;
    private javax.swing.JLabel taking_juce;
    private javax.swing.JLabel taking_juce_month;
    private javax.swing.JLabel taking_juce_year;
    private javax.swing.JLabel taking_jwajem;
    private javax.swing.JLabel taking_jwajem_month;
    private javax.swing.JLabel taking_jwajem_year;
    private javax.swing.JLabel taking_water;
    private javax.swing.JLabel taking_water_month;
    private javax.swing.JLabel taking_water_year;
    private javax.swing.JLabel time_label;
    private javax.swing.JLabel total_crepe;
    private javax.swing.JLabel total_crepe_month;
    private javax.swing.JLabel total_crepe_year;
    private javax.swing.JLabel total_drinks;
    private javax.swing.JLabel total_drinks_month;
    private javax.swing.JLabel total_drinks_year;
    private javax.swing.JLabel total_food;
    private javax.swing.JLabel total_food_month;
    private javax.swing.JLabel total_food_year;
    private javax.swing.JLabel total_hookah;
    private javax.swing.JLabel total_hookah_month;
    private javax.swing.JLabel total_hookah_year;
    private javax.swing.JLabel total_juce;
    private javax.swing.JLabel total_juce_month;
    private javax.swing.JLabel total_juce_year;
    private javax.swing.JLabel total_jwajem;
    private javax.swing.JLabel total_jwajem_mounth;
    private javax.swing.JLabel total_jwajem_year;
    private javax.swing.JLabel total_taking;
    private javax.swing.JLabel total_taking1;
    private javax.swing.JLabel total_water;
    private javax.swing.JLabel total_water_month;
    private javax.swing.JLabel total_water_year;
    private javax.swing.JComboBox<String> water_month;
    private javax.swing.JComboBox<String> water_soda;
    private javax.swing.JComboBox<String> water_year;
    // End of variables declaration//GEN-END:variables
}
