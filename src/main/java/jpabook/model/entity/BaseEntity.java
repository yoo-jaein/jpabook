package jpabook.model.entity;

import javax.persistence.MappedSuperclass;
import java.util.Date;

//매핑 정보를 상속하기 위한 클래스
@MappedSuperclass
public class BaseEntity {

    private Date createdDate;        //등록일
    private Date lastModifiedDate;  //수정일

    //Getter, Setter
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
