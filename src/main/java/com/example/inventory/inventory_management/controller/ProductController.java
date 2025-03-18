package com.example.inventory.inventory_management.controller;
import com.example.inventory.inventory_management.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.apache.commons.io.FilenameUtils;
import java.io.InputStream;


@RestController
@RequestMapping(value="/api/products")
public class ProductController {


    @Autowired
    private ProductService productService;

    @PostMapping("/upload")
    public String uploadExcel(@RequestParam("file") MultipartFile file) {
        try {
            String filename = file.getOriginalFilename();
            if (filename != null) {
                String consignmentName = FilenameUtils.getBaseName(filename);
                InputStream fileInputStream = file.getInputStream();

                // Pass the file input stream and consignment name to the service
                productService.processExcelData(fileInputStream, consignmentName);

                return "File uploaded and data inserted successfully!";
            } else {
                return "Failed to get file name.";
            }
        } catch (Exception e) {
            return "Failed to process file: " + e.getMessage();
        }
    }

}
