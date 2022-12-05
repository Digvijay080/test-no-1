package inheritance.parentandchild;

public class IplTeam {
	
	void Play()
	{
		System.out.println("Play for entertainment");
	}
}
	
	class Csk extends IplTeam
	{
		void Play()
		{
			super.Play();
			System.out.println("Play for Chennai");
		}
	}
	
	class Rcb extends IplTeam
	{
		void Play()
		{
			super.Play();
			System.out.println("Play for Bangalore");
		}
	}

