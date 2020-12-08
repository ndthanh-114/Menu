package com.example.menu;


import android.app.LauncherActivity;
import android.view.View;

import java.util.ArrayList;

public class MyData {
    //fake data
    public static String [] names = {"Eduria.com","Chris Abad","Tuto.com","support","Matt from Ionic","Udemy Instructor",
            "GitHub","Google","Entopy","Dabia","Jesus","Gawr Gura"};
    public static String [] titles = {"$19 Only(First 10 spots) - Bestselling...","Help make Campaign Monitor better",
            "8h de formation gratuite et les nouvea...","Societe Ovh: suivi de vos services - hp...","New " +
            "Ionic Creator Is Here!","Early Bird Discount on new ML course: 48...",
            "Discover what’s new at GitHub","Security Alert!","Idk Man These titles are hard","Rlly Running outta ideas here",
            "My Bible!","a"};
    public static String [] times = {"1:00 am","0:00 pm","11:11 am","6:13 am","12:30 pm", "9:52 am", "6:10 am","4:50 pm","12:00 pm","7:00 pm","9:20 am","3:10 pm"};
    public static String [] contents = {"Are you looking to Learn Web Designin...","Let us know your thoughts! No Images...",
            "Photoshop, SEO, Blender, CSS, WordPre...","SAS OVH - http://www.ovh 2 rue K...","Announcing the all-new Creator, build...",
            "There is only 4...","We’re constantly learning, buil...","academia.edu has been granted access...","Smth Smth smth smth",
            "bla bla bla bla bleh","Im sory if this is offensive...","Im drunk but singer :3..."};
    public static Integer [] avatar = {R.drawable.j,R.drawable.c,R.drawable.t,R.drawable.s,R.drawable.m,R.drawable.u,
            R.drawable.g,R.drawable.g2,R.drawable.j,R.drawable.d,R.drawable.j,R.drawable.g};

    public class DbRecord{
        public String name,title,content,time;
        public Integer avatar,favorite;
        public boolean clicked1,clicked2;
        public int previousPosition=-1;
        public boolean check=true;
        public boolean favor=true;
        public View previousView;

        public DbRecord(String name, String title, String content, String time, Integer img1, Integer img2) {
            this.name = name;
            this.title = title;
            this.content = content;
            this.time = time;
            this.avatar = img1;
            this.favorite = img2;
            clicked1=false;
            clicked2=false;
        }


    }

    public static ArrayList <DbRecord> dbList = new ArrayList<DbRecord>();

    public MyData(){
        for(int i=0; i<names.length; i++){
            dbList.add(new DbRecord(names[i],titles[i],
                    contents[i],times[i],avatar[i],
                    android.R.drawable.btn_star_big_off));
        }
    }
}
