package liuyuyang.net.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Rss {
    @ApiModelProperty(value = "作者", example = "宇阳")
    private String author;
    @ApiModelProperty(value = "网站标题", example = "这是一个网站")
    private String title;
    @ApiModelProperty(value = "网站描述", example = "这是一个网站的描述")
    private String description;
    @ApiModelProperty(value = "网站链接", example = "/")
    private String url;
    @ApiModelProperty(value = "网站创建时间", example = "1723533206613")
    private String createTime;
}