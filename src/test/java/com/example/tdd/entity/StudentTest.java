package com.example.tdd.entity;

import cn.hutool.json.JSONUtil;
import com.example.tdd.util.judgement.EmptyUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class StudentTest {
    @Test
    void strange_group_by_id() {
        List<Student> list = new ArrayList<>();
        list.add(buildStudent(1L, "xxx1"));
        list.add(buildStudent(2L, "xxx2"));
        list.add(buildStudent(3L, "xxx3"));
        Map<Long, List<Student>> collect = list.stream().collect(Collectors.groupingBy(Student::getId));
        collect.forEach((k, v) -> EmptyUtil.logger.info("将集合中的每一个对象按照主键转换为数组：{}", JSONUtil.toJsonPrettyStr(v)));
    }

    private Student buildStudent(long id, String name) {
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        return student;
    }

    @Test
    void test_gson_serialize_null_filed() throws Exception {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.serializeNulls();
        Gson gson = gsonBuilder.create();
        Student student = buildStudent(0, null);
        String s = gson.toJson(student);
        System.err.println(s);

    }
}
