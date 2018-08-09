package izhbg.cloud.demo.service.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: xiaolongcai2@creditease.cn
 * @Date: 2018/8/8 10:44
 * @Description:
 */
public class AtrributeParames implements Serializable {

    private String id;
    private String name;
    private Integer age;
    private List<String> loves;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getLoves() {
        return loves;
    }

    public void setLoves(List<String> loves) {
        this.loves = loves;
    }
}
