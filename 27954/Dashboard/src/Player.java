
public  class Player extends Team  {
	private String name;
	private int age;
	private int jnumber;
	private int numOfMatchPlayed;
	
	
	public Player() {
		
	}


	public Player(String name) {
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	public Player(String nameOfteam,String name, int age,int jnumber, int numOfMatchPlayed) {
		super(nameOfteam);
		this.name=name;
		this.age=age;
		this.jnumber=jnumber;
		this.numOfMatchPlayed=numOfMatchPlayed;
	}

	public Player(String name, int age, int jnumber, int numOfMatchPlayed) {
		super();
		this.name = name;
		this.age = age;
		this.jnumber = jnumber;
		this.numOfMatchPlayed = numOfMatchPlayed;
	}
	
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getJnumber() {
		return jnumber;
	}


	public void setJnumber(int jnumber) {
		this.jnumber = jnumber;
	}


	public int getNumOfMatchPlayed() {
		return numOfMatchPlayed;
	}


	public void setNumOfMatchPlayed(int numOfMatchPlayed) {
		this.numOfMatchPlayed = numOfMatchPlayed;
	}
	
	
	

}
