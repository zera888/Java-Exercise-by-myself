interface IDesc{
	public String getDescription();
}
	public enum Action3 implement IDesc{
		TURN_LEFT("�V����"),TURN_RIGHT("�V�k��"),SHOOT("�g��");
		private String desc{
		// /�����}���غc��k
			private Action3(String desc) {
				this.desc=desc;
			}
		}
	}


	public Stromg getDescrition() {
		// TODO Auto-generated constructor stub
		return desc;
	}
