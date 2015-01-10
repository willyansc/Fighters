package com.anonymous.whale.sim.domain;

/**
 * Created by qinliujie on 15-1-10.
 */
public class Image {
    private Integer id;
    private String url;
    private String name;
    private String alt;
    private Integer type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return new StringBuffer()
                .append("id=").append(id)
                .append(" url=").append(url)
                .append(" name=").append(name)
                .append(" alt=").append(alt)
                .append(" type=").append(type)
                .toString();
    }
}
