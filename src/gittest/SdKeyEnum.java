package gittest;

public enum SdKeyEnum {

	TD_CHECK_RSP("������ѯ���");
	
	private String remark;
	
	private SdKeyEnum(String remark){
		this.remark = remark;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
