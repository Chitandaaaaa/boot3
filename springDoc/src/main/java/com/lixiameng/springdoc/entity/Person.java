package com.lixiameng.springdoc.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-25 13:00
 */
@Schema(title = "人员")
@Data
public class Person {
    @Schema(title = "名称")
    String name;
    @Schema(title = "电话")
    String phone;
}
