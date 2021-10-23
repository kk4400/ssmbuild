package com.say.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Bbooks {
     private int bookID;
     private String bookName;
     private int bookCounts;
     private String detail;

}
