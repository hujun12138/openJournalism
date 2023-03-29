package com.example.openchina.Bean;

public class MyInfo {

    /**
     * code : 1
     * obj_data : {"devplatform":"","expertise":"","fans":0,"favorite_count":0,"followers":0,"from":"湖南 长沙","gender":0,"id":6503560,"jointime":"2023-03-03 15:22:31","latestonline":"2023-03-03 15:57:31","name":"osc_15069899","portrait":"","score":0}
     */

    public int code;
    /**
     * devplatform :
     * expertise :
     * fans : 0
     * favorite_count : 0
     * followers : 0
     * from : 湖南 长沙
     * gender : 0
     * id : 6503560
     * jointime : 2023-03-03 15:22:31
     * latestonline : 2023-03-03 15:57:31
     * name : osc_15069899
     * portrait :
     * score : 0
     */

    public ObjDataBean obj_data;

    public static class ObjDataBean {
        public String devplatform;
        public String expertise;
        public int fans;
        public int favorite_count;
        public int followers;
        public String from;
        public int gender;
        public int id;
        public String jointime;
        public String latestonline;
        public String name;
        public String portrait;
        public int score;
    }
}
