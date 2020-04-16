package zcip.peak.entity;

public class Prize {
		private String pid;
		private String pname;
		private Integer pgrade;
		private Integer pnum;
		private String pdesc;
		
		public Prize(){}

		public Prize(String pid, String pname, Integer pgrade, Integer pnum,
				String pdesc) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.pgrade = pgrade;
			this.pnum = pnum;
			this.pdesc = pdesc;
		}

		public String getPid() {
			return pid;
		}

		public void setPid(String pid) {
			this.pid = pid;
		}

		public String getPname() {
			return pname;
		}

		public void setPname(String pname) {
			this.pname = pname;
		}

		public Integer getPgrade() {
			return pgrade;
		}

		public void setPgrade(Integer pgrade) {
			this.pgrade = pgrade;
		}

		public Integer getPnum() {
			return pnum;
		}

		public void setPnum(Integer pnum) {
			this.pnum = pnum;
		}

		public String getPdesc() {
			return pdesc;
		}

		public void setPdesc(String pdesc) {
			this.pdesc = pdesc;
		}

		@Override
		public String toString() {
			return "Prize [pid=" + pid + ", pname=" + pname + ", pgrade="
					+ pgrade + ", pnum=" + pnum + ", pdesc=" + pdesc + "]";
		}
		
		
}
