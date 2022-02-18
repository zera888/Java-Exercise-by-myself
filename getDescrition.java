interface IDesc{
	public String getDescription();
}
	public enum Action3 implement IDesc{
		TURN_LEFT("向左轉"),TURN_RIGHT("向右轉"),SHOOT("射擊");
		private String desc{
		// /不公開的建構方法
			private Action3(String desc) {
				this.desc=desc;
			}
		}
	}


	public Stromg getDescrition() {
		// TODO Auto-generated constructor stub
		return desc;
	}
