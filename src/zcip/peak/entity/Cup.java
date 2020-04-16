package zcip.peak.entity;

public class Cup {
		private String cid;
		private String pid;
		private String uid;
		
		public Cup(){}

		public Cup(String cid, String pid, String uid) {
			super();
			this.cid = cid;
			this.pid = pid;
			this.uid = uid;
		}

		public String getCid() {
			return cid;
		}

		public void setCid(String cid) {
			this.cid = cid;
		}

		public String getPid() {
			return pid;
		}

		public void setPid(String pid) {
			this.pid = pid;
		}

		public String getUid() {
			return uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}

		@Override
		public String toString() {
			return "Cup [cid=" + cid + ", pid=" + pid + ", uid=" + uid + "]";
		}
		
		
}
