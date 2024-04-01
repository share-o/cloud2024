package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.catalina.realm.UserDatabaseRealm;

@Data
@TableName(value = "user")
public class User {
    @TableId
    private String name;
    @TableField
    private Integer age;
}
