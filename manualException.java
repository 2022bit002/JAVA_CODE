interface Voter{
	void casteVote();
}

interface EC{
	//  void validVoter(int minAge) throws Exception;  here we are using the built in Exception class
	void validVoter(int minAge) throws ManualException;
}

class ECIndia implements Voter , EC{
	final int minAge;
	ECIndia(int minAge){
		this.minAge=minAge;
	}
	public void casteVote(){
	System.out.println("you caste the vote successfully");
	
	}
	//  public void validVoter(int minAge) throws Exception{   here we are using the built in Exception class
	public void validVoter(int minAge) throws ManualException{
		if(minAge<18){
			//  throw new Exception("It is not the valid age");
			throw new ManualException("It is not the valid age this msg is given manually ");
		}{
		casteVote();
		}
	}
}


class LSElection{
	//  public static void main(String args[])throws Exception{  here we are using the built in Exception class
	public static void main(String args[])throws ManualException{
		ECIndia ecIndia = new ECIndia(18);
		ecIndia.validVoter(46);
	}

}

class ManualException extends Exception{
	ManualException(String error){
		super(error);	
	}

}
