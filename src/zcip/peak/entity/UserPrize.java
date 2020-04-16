package zcip.peak.entity;

public class UserPrize {
		private String cid;
		private String uname;
		private String utel;
		private Integer pgrade;
		private String pname;
		
		public UserPrize(){}

		public UserPrize(String cid, String uname, String utel, Integer pgrade,
				String pname) {
			super();
			this.cid = cid;
			this.uname = uname;
			this.utel = utel;
			this.pgrade = pgrade;
			this.pname = pname;
		}

		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		public String getUtel() {
			return utel;
		}
		public void setUtel(String utel) {
			this.utel = utel;
		}
		public Integer getPgrade() {
			return pgrade;
		}
		public void setPgrade(Integer pgrade) {
			this.pgrade = pgrade;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		
		public String getCid() {
			return cid;
		}

		public void setCid(String cid) {
			this.cid = cid;
		}

		@Override
		public String toString() {
			return "UserPrize [cid=" + cid + ", uname=" + uname + ", utel="
					+ utel + ", pgrade=" + pgrade + ", pname=" + pname + "]";
		}		
		
}
