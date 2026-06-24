package com.perpustakaan.model;

public class Member {

    private String idMember;
    private String NamaMember;
    private String alamat;
    private int postal;

    public Member() {
    }

    public Member(String idMember, String NamaMember, String alamat, int postal) {
        this.idMember = idMember;
        this.NamaMember = NamaMember;
        this.alamat = alamat;
        this.postal = postal;
    }

    public String getIdMember() {
        return idMember;
    }

    public void setIdMember(String idMember) {
        this.idMember = idMember;
    }

    public String getNamaMember() {
        return NamaMember;
    }

    public void setNamaMember(String NamaMember) {
        this.NamaMember = NamaMember;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getPostal() {
        return postal;
    }

    public void setPostal(int postal) {
        this.postal = postal;
    }
}
