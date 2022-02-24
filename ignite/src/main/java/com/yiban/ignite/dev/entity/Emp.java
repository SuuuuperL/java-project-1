package com.yiban.ignite.dev.entity;

import org.apache.ignite.cache.query.annotations.QuerySqlField;

import java.io.Serializable;

public class Emp implements Serializable {
    private static final long serialVersionUID = 5158183685676617514L;

    /** Indexed field. Will be visible to the SQL engine. */
    @QuerySqlField(index = true)
    private long id;

    /** Queryable field. Will be visible to the SQL engine. */
    @QuerySqlField
    private long empno;

    /** Queryable field. Will be visible to the SQL engine. */
    @QuerySqlField
    private String ename;

    public Emp() {
    }

    public Emp(long id, long empno,String ename) {
        this.id = id;
        this.empno = empno;
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", empno=" + empno +
                ", ename='" + ename + '\'' +
                '}';
    }

    public long getEmpno() {
        return empno;
    }

    public void setEmpno(long empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
}
