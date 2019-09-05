class QueueApp
{
	public static void main(String args[]){

		Queue queue = new Queue(10);

		while(!queue.isFull())
		{
			int x = (int)(Math.random()*100);
			queue.insert(x);
		}

		while(!queue.isEmpty()){
			System.out.print(queue.remove()+ " ");
		}
	}
}