package com.example.demo.status;

import com.example.demo.status.Status;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter // Essa anotação inclui a função atualizarStatus, que seria o mesmo que setStatus
@NoArgsConstructor
@AllArgsConstructor
public class Status {
    private String status;
}