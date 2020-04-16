package zcip.peak.entity;

public class User {
		private String uid;
		private String uname;
		private String utel;
		private String uemail;
		private Integer uage;
		private Integer usex;
		
		public User(){}

		public User(String uid, String uname, String utel, String uemail,
				Integer uage, Integer usex) {
			super();
			this.uid = uid;
			this.uname = uname;
			this.utel = utel;
			this.uemail = uemail;
			this.uage = uage;
			this.usex = usex;
		}

		public String getUid() {
			return uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
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

		public String getUemail() {
			return uemail;
		}

		public void setUemail(String uemail) {
			this.uemail = uemail;
		}

		public Integer getUage() {
			return uage;
		}

		public void setUage(Integer uage) {
			this.uage = uage;
		}

		public Integer getUsex() {
			return usex;
		}

		public void setUsex(Integer usex) {
			this.usex = usex;
		}

		@Override
		public String toString() {
			return "User [uid=" + uid + ", uname=" + uname + ", utel=" + utel
					+ ", uemail=" + uemail + ", uage=" + uage + ", usex="
					+ usex + "]";
		}
		
		
}
