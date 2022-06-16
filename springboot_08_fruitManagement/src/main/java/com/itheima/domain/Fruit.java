package com.itheima.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Diyang Li
 * @create 2022-06-15 11:46 PM
 */

@Data
public class Fruit {
    @TableId("fid")
    private int fid;
    private String fname;
    private int price;
    private int fcount;
    private String remark;
}
