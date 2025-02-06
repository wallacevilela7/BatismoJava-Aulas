package wvs.ninja;

import wvs.ninja.mission.Mission;

public class Ninja {
    private String name;
    private Integer age;
    private Mission misson;

    public Ninja() {
    }

    public Ninja(String name, Integer age, Mission misson) {
        this.name = name;
        this.age = age;
        this.misson = misson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Mission getMisson() {
        return misson;
    }

    public void setMisson(Mission misson) {
        this.misson = misson;
    }

    @Override
    public String toString(){
        return "Nome: " + name + ", " + "\n" +
                "Age: " + age  + ", " + "\n" +
                "Mission: " + misson.getMissionName() + ", " + "\n" +
                "Level: " + misson.getLevel() + ", " + "\n" +
                "Status: " + misson.getStatus() + ", ";
    }
}