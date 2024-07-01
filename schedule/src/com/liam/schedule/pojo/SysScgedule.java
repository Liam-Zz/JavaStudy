package com.liam.schedule.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SysScgedule {
    private Integer sid;
    private Integer uid;
    private String title;
    private Integer completed;
}
