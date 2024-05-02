package com.example.management;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.List;

@Document(collection = "stock")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private ObjectId id;
    private String department;
    private String product;
    private double quantity;
    private double price;
    private List<HashMap<String, Integer>> ingredients;
    private double min_quantity;
}
