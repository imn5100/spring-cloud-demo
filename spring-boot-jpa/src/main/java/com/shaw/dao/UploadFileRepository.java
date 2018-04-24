package com.shaw.dao;

import com.shaw.domain.UploadFile;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UploadFileRepository extends PagingAndSortingRepository<UploadFile, Integer> {
    List<UploadFile> findAllByType(Byte type);
}
