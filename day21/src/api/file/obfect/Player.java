package api.file.obfect;

public class Player {
	private String playerId;
	private int playerLevel;
	private int playerMoney;
	
	
	
	public Player(String playerId, int playerLevel, int playerMoney) {
		super();
		this.playerId = playerId;
		this.playerLevel = playerLevel;
		this.playerMoney = playerMoney;
	}
	
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public int getPlayerLevel() {
		return playerLevel;
	}
	public void setPlayerLevel(int playerLevel) {
		
		this.playerLevel = playerLevel;
	}
	public int getPlayerMoney() {
		return playerMoney;
	}
	public void setPlayerMoney(int playerMoney) {
		this.playerMoney = playerMoney;
	}
	
	public  void show() {
		System.out.println("아이디:"+this.playerId);
		System.out.println("레벨: "+ this.playerLevel);
		System.out.println("소지금: "+this.playerMoney);
		
	}
		

	
	
	
	
	
	
	
}
