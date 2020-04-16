package zcip.peak.entity;

public class CupAll {
		private Prize prize;
		
		private User user;
		
		private String cid;

		public Prize getPrize() {
			return prize;
		}

		public void setPrize(Prize prize) {
			this.prize = prize;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		
		
		
		@Override
		public String toString() {
			return "CupAll [prize=" + prize + ", user=" + user + ", cid=" + cid
					+ "]";
		}

		public String getCid() {
			return cid;
		}

		public void setCid(String cid) {
			this.cid = cid;
		}

		public CupAll(){}

		public CupAll(Prize prize, User user, String cid) {
			super();
			this.prize = prize;
			this.user = user;
			this.cid = cid;
		}

		
		
		
}
