package com.shaw;

import com.shaw.dao.UploadFileRepository;
import com.shaw.domain.UploadFile;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTestApplicationTests {

    @Autowired
    private UploadFileRepository uploadFileRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testUploadFileByType() {
        byte nonType = 3;
        List<UploadFile> uploadFileList = uploadFileRepository.findAllByType(nonType);
        Assert.assertNotNull(uploadFileList);
        uploadFileList.forEach(System.out::println);
    }

}
