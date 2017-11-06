package com.offcn.po;

public class Mobilenum {
    private Integer id;

    private String mobilenumber;

    private String mobliearea;

    private String mobiletype;

    private String areacode;

    private String postcode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber == null ? null : mobilenumber.trim();
    }

    public String getMobliearea() {
        return mobliearea;
    }

    public void setMobliearea(String mobliearea) {
        this.mobliearea = mobliearea == null ? null : mobliearea.trim();
    }

    public String getMobiletype() {
        return mobiletype;
    }

    public void setMobiletype(String mobiletype) {
        this.mobiletype = mobiletype == null ? null : mobiletype.trim();
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode == null ? null : areacode.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

	@Override
	public String toString() {
		return "Mobilenum [id=" + id + ", mobilenumber=" + mobilenumber + ", mobliearea=" + mobliearea + ", mobiletype="
				+ mobiletype + ", areacode=" + areacode + ", postcode=" + postcode + "]";
	}
    
}