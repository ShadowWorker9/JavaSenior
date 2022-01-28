package com.yuanlin.java;

public class SeasonTest {

    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);
    }
}
 class Season{
    //声明season对象的属性，并且设置为private final的
    private final String seasonName;
    private final String seasonDesc;

    //私有化类的对象，并给对象的属性赋值
     public Season(String seasonName, String seasonDesc) {
         this.seasonName = seasonName;
         this.seasonDesc = seasonDesc;
     }
     //提供当前枚举类的多个对象
     public static final Season SPRING = new Season("春天","春暖花开");
     public static final Season SUMMER = new Season("夏天","骄阳似火");
     public static final Season AUTUMN = new Season("秋天","硕果累累");
     public static final Season WINTER = new Season("冬天","冰雪交融");

     public String getSeasonName() {
         return seasonName;
     }

     public String getSeasonDesc() {
         return seasonDesc;
     }

     @Override
     public String toString() {
         return "Season{" +
                 "seasonName='" + seasonName + '\'' +
                 ", seasonDesc='" + seasonDesc + '\'' +
                 '}';
     }
 }
