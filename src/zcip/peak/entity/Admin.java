package zcip.peak.entity;

public class Admin {
		private String aid;
		private String ausername;
		private String apassword;
		private String amail;
		
		public Admin(){}


		public Admin(String aid, String ausername, String apassword,
				String amail) {
			super();
			this.aid = aid;
			this.ausername = ausername;
			this.apassword = apassword;
			this.amail = amail;
		}


		public String getAid() {
			return aid;
		}

		public void setAid(String aid) {
			this.aid = aid;
		}

		public String getAusername() {
			return ausername;
		}

		public void setAusername(String ausername) {
			this.ausername = ausername;
		}

		public String getApassword() {
			return apassword;
		}

		public void setApassword(String apassword) {
			this.apassword = apassword;
		}
		

		public String getAmail() {
			return amail;
		}


		public void setAmail(String amail) {
			this.amail = amail;
		}


		@Override
		public String toString() {
			return "Admin [aid=" + aid + ", ausername=" + ausername
					+ ", apassword=" + apassword + ", amail=" + amail + "]";
		}
				
}
