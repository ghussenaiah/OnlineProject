package com.test.normal.test;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.codec.binary.StringUtils;

public class SplitString {
	
	public static void main(String args[])
	{
		String dataString="t";
		if(!dataString.isEmpty()){
		String[] Values = dataString.split("\\~");
		System.out.println(Values.length);
		}
		String value = (String) ConvertUtils.convert(dataString, String.class);
		System.out.println(value+"am null");
		
		String testing=" In";
		if(testing.equalsIgnoreCase("In"))
		{
			System.out.println("Im true");
		}
		if(testing.contains(" In"))
		{
			String beforeFirstDot = testing.split("\\s")[0];
			int count=3;
			
			  StringBuilder inClause=null;
			  StringBuilder finale=new StringBuilder();
			  finale.append("(");
			  //String InClauseList[]=paramsList.split("\\,");
			  for(int i=0;i<count;i++)
			  {
				  inClause= new StringBuilder();
				  inClause.append("?").append(",");
				  finale.append(inClause.toString());
				  
			  }
			  StringBuilder testing1 =new StringBuilder(finale.toString().substring(0, finale.toString().length() - 1));
			   testing1.append(")");
			   System.out.println(testing1.toString());
			   
			   StringBuilder clai=new StringBuilder(beforeFirstDot);
			   clai.append(" ").append("in ").append(testing1.toString());
			   System.out.println(clai.toString());
		}
			/*String paramsList="test,test1";
		  StringBuilder inClause=null;
		  StringBuilder finale=new StringBuilder();
		  finale.append("(");
		  String InClauseList[]=paramsList.split("\\,");
		  for(String param:InClauseList)
		  {
			  inClause= new StringBuilder();
			  inClause.append("\'").append(param).append("\'").append(",");
			  finale.append(inClause.toString());
			  
		  }
		  StringBuilder testing1 =new StringBuilder(finale.toString().substring(0, finale.toString().length() - 1));
		 
		  testing1.append(")");
		  System.out.println(testing1.toString());
		  */
		 /* 
		  StringBuilder sbSql = new StringBuilder( 1024 );
		  sbSql.append( "select * from userinfo where firstname in(" );

		  for( int i=0; i < Parameter.length; i++ ) {
		    if( i > 0 ) sbSql.append( "," );
		    sbSql.append( " ?" );
		  } // for
		  sbSql.append( " )" );
		  PreparedStatement pst = conn.prepareStatement( sbSql.toString() );

		  for( int i=0; i < Parameter.length; i++ ) {
		    pst.setString( i+1, Parameter[ i ] );
		  } // for

		  ResultSet rs = pst.executeQuery();*/
	}

}
