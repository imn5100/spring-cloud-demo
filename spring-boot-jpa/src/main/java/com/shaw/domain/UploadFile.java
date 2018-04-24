package com.shaw.domain;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "upload_file")
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class UploadFile implements Serializable {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer id;

    private String filename;

    private String url;

    private Byte type;

    private Long size;

    private String storename;

    private String path;

    private Long uploadTime;

    private String hash;

    private String mimetype;

    private String detail;

    private Byte isValid;

    public static final byte TYPE_QINIU = 1;
    public static final byte TYPE_SMMS = 2;

    @Override
    public String toString() {
        return "UploadFile{" +
                "id=" + id +
                ", filename='" + filename + '\'' +
                ", url='" + url + '\'' +
                ", type=" + type +
                ", size=" + size +
                ", storename='" + storename + '\'' +
                ", path='" + path + '\'' +
                ", uploadTime=" + uploadTime +
                ", hash='" + hash + '\'' +
                ", mimetype='" + mimetype + '\'' +
                ", detail='" + detail + '\'' +
                ", isValid=" + isValid +
                '}';
    }
}
