package com.yzg.springbootdatamogodb.pojo;

import org.springframework.data.annotation.Id;

import java.util.Arrays;

/**
 * @Auther：印志刚
 * @Date：2018/9/6 16:10
 * @Description：
 */
public class User {
    @Id
    private String id;

    private String name;

    private String[] sons =new String[]{};

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSons() {
        return sons;
    }

    public void setSons(String[] sons) {
        this.sons = sons;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sons=" + Arrays.toString(sons) +
                '}';
    }
}
