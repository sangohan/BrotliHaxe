// Generated by Haxe 3.4.0
package decode.bit_reader;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class BrotliBitReader extends haxe.lang.HxObject
{
	public BrotliBitReader(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public BrotliBitReader()
	{
		//line 32 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
		decode.bit_reader.BrotliBitReader.__hx_ctor_decode_bit_reader_BrotliBitReader(this);
	}
	
	
	public static void __hx_ctor_decode_bit_reader_BrotliBitReader(decode.bit_reader.BrotliBitReader __hx_this)
	{
		//line 30 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
		__hx_this.buf_off = 0;
		//line 29 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
		{
			//line 29 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
			int[] this1 = null;
			//line 29 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
			this1 = new int[8320];
			//line 29 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
			__hx_this.buf_ = ((int[]) (this1) );
		}
		
	}
	
	
	public int val_;
	
	public int pos_;
	
	public int bit_pos_;
	
	public int bit_end_pos_;
	
	public int eos_;
	
	public int[] buf_ptr_;
	
	public int buf_ptr_off;
	
	public decode.streams.BrotliInput input_;
	
	public int finish_;
	
	public int tmp_bytes_read_;
	
	public int[] buf_;
	
	public int buf_off;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
		{
			//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
			switch (field.hashCode())
			{
				case 227797411:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("buf_off")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						this.buf_off = ((int) (value) );
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return value;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 3611998:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("val_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						this.val_ = ((int) (value) );
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return value;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 607450509:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("tmp_bytes_read_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						this.tmp_bytes_read_ = ((int) (value) );
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return value;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 3446923:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("pos_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						this.pos_ = ((int) (value) );
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return value;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case -853014996:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("finish_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						this.finish_ = ((int) (value) );
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return value;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 1107489917:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("bit_pos_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						this.bit_pos_ = ((int) (value) );
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return value;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 907045586:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("buf_ptr_off")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						this.buf_ptr_off = ((int) (value) );
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return value;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 559098977:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("bit_end_pos_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						this.bit_end_pos_ = ((int) (value) );
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return value;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 3119222:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("eos_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						this.eos_ = ((int) (value) );
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return value;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
			}
			
			//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
		{
			//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
			switch (field.hashCode())
			{
				case 227797411:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("buf_off")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						this.buf_off = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return value;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 3611998:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("val_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						this.val_ = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return value;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 3035212:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("buf_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						this.buf_ = ((int[]) (value) );
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return value;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 3446923:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("pos_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						this.pos_ = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return value;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 607450509:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("tmp_bytes_read_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						this.tmp_bytes_read_ = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return value;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 1107489917:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("bit_pos_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						this.bit_pos_ = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return value;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case -853014996:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("finish_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						this.finish_ = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return value;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 559098977:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("bit_end_pos_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						this.bit_end_pos_ = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return value;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case -1183866411:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("input_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						this.input_ = ((decode.streams.BrotliInput) (value) );
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return value;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 3119222:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("eos_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						this.eos_ = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return value;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 907045586:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("buf_ptr_off")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						this.buf_ptr_off = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return value;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case -1528171139:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("buf_ptr_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						this.buf_ptr_ = ((int[]) (value) );
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return value;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
			}
			
			//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
		{
			//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
			switch (field.hashCode())
			{
				case 227797411:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("buf_off")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return this.buf_off;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 3611998:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("val_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return this.val_;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 3035212:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("buf_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return this.buf_;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 3446923:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("pos_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return this.pos_;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 607450509:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("tmp_bytes_read_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return this.tmp_bytes_read_;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 1107489917:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("bit_pos_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return this.bit_pos_;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case -853014996:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("finish_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return this.finish_;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 559098977:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("bit_end_pos_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return this.bit_end_pos_;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case -1183866411:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("input_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return this.input_;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 3119222:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("eos_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return this.eos_;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 907045586:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("buf_ptr_off")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return this.buf_ptr_off;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case -1528171139:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("buf_ptr_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return this.buf_ptr_;
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
			}
			
			//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
		{
			//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
			switch (field.hashCode())
			{
				case 227797411:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("buf_off")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return ((double) (this.buf_off) );
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 3611998:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("val_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return ((double) (this.val_) );
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 607450509:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("tmp_bytes_read_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return ((double) (this.tmp_bytes_read_) );
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 3446923:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("pos_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return ((double) (this.pos_) );
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case -853014996:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("finish_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return ((double) (this.finish_) );
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 1107489917:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("bit_pos_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return ((double) (this.bit_pos_) );
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 907045586:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("buf_ptr_off")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return ((double) (this.buf_ptr_off) );
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 559098977:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("bit_end_pos_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return ((double) (this.bit_end_pos_) );
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
				case 3119222:
				{
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					if (field.equals("eos_")) 
					{
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						__temp_executeDef1 = false;
						//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
						return ((double) (this.eos_) );
					}
					
					//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
					break;
				}
				
				
			}
			
			//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
		baseArr.push("buf_off");
		//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
		baseArr.push("buf_");
		//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
		baseArr.push("tmp_bytes_read_");
		//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
		baseArr.push("finish_");
		//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
		baseArr.push("input_");
		//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
		baseArr.push("buf_ptr_off");
		//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
		baseArr.push("buf_ptr_");
		//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
		baseArr.push("eos_");
		//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
		baseArr.push("bit_end_pos_");
		//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
		baseArr.push("bit_pos_");
		//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
		baseArr.push("pos_");
		//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
		baseArr.push("val_");
		//line 10 "C:\\Users\\Dominik\\Brotli\\src\\decode\\bit_reader\\BrotliBitReader.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}

