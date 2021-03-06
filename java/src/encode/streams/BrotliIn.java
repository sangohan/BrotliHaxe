// Generated by Haxe 3.4.0
package encode.streams;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class BrotliIn extends haxe.lang.HxObject
{
	public BrotliIn(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public BrotliIn(sys.io.FileInput f, int max_read_size)
	{
		//line 21 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
		encode.streams.BrotliIn.__hx_ctor_encode_streams_BrotliIn(this, f, max_read_size);
	}
	
	
	public static void __hx_ctor_encode_streams_BrotliIn(encode.streams.BrotliIn __hx_this, sys.io.FileInput f, int max_read_size)
	{
		//line 23 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
		__hx_this.f_ = f;
		//line 24 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
		__hx_this.buffer_ = haxe.root.FunctionMalloc.mallocUInt(max_read_size);
		//line 25 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
		__hx_this.buffer_size_ = max_read_size;
	}
	
	
	public sys.io.FileInput f_;
	
	public int[] buffer_;
	
	public int buffer_size_;
	
	public int[] Read(int n, haxe.root.Array<java.lang.Object> bytes_read)
	{
		//line 28 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
		if (( this.buffer_ == null )) 
		{
			//line 29 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			bytes_read.__set(0, 0);
			//line 30 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			return null;
		}
		
		//line 32 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
		if (( n > this.buffer_size_ )) 
		{
			//line 33 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			n = this.buffer_size_;
		}
		else
		{
			//line 34 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			if (( n == 0 )) 
			{
				//line 35 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
				if (this.f_._eof) 
				{
					//line 35 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
					return null;
				}
				else
				{
					//line 35 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
					return this.buffer_;
				}
				
			}
			
		}
		
		//line 37 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
		if (this.f_._eof) 
		{
			//line 38 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			return null;
		}
		
		//line 39 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
		haxe.io.Bytes bytes = haxe.io.Bytes.alloc(n);
		//line 40 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
		try 
		{
			//line 41 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			int size = this.f_.readBytes(bytes, 0, n);
			//line 42 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			{
				//line 42 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
				int _g1 = 0;
				//line 42 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
				while (( _g1 < size ))
				{
					//line 42 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
					int i = _g1++;
					//line 43 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
					((int[]) (this.buffer_) )[i] = ((int) (( bytes.b[i] & 255 )) );
				}
				
			}
			
			//line 44 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			bytes_read.__set(0, size);
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 40 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 45 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 45 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 45 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 45 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			if (( __temp_catchall2 instanceof haxe.io.Eof )) 
			{
				//line 45 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
				haxe.io.Eof e = ((haxe.io.Eof) (__temp_catchall2) );
				//line 45 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
				{
				}
				
			}
			else
			{
				//line 45 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
				throw haxe.lang.HaxeException.wrap(__temp_catchallException1);
			}
			
		}
		
		
		//line 47 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
		if (( ((int) (haxe.lang.Runtime.toInt(bytes_read.__get(0))) ) == 0 )) 
		{
			//line 48 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			return null;
		}
		else
		{
			//line 50 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			return this.buffer_;
		}
		
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
		{
			//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			switch (field.hashCode())
			{
				case -1710364737:
				{
					//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
					if (field.equals("buffer_size_")) 
					{
						//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
						__temp_executeDef1 = false;
						//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
						this.buffer_size_ = ((int) (value) );
						//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
						return value;
					}
					
					//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
					break;
				}
				
				
			}
			
			//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
		{
			//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			switch (field.hashCode())
			{
				case -1710364737:
				{
					//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
					if (field.equals("buffer_size_")) 
					{
						//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
						__temp_executeDef1 = false;
						//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
						this.buffer_size_ = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
						return value;
					}
					
					//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
					break;
				}
				
				
				case 3257:
				{
					//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
					if (field.equals("f_")) 
					{
						//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
						__temp_executeDef1 = false;
						//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
						this.f_ = ((sys.io.FileInput) (value) );
						//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
						return value;
					}
					
					//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
					break;
				}
				
				
				case 227996703:
				{
					//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
					if (field.equals("buffer_")) 
					{
						//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
						__temp_executeDef1 = false;
						//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
						this.buffer_ = ((int[]) (value) );
						//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
						return value;
					}
					
					//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
					break;
				}
				
				
			}
			
			//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
		{
			//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			switch (field.hashCode())
			{
				case 2543030:
				{
					//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
					if (field.equals("Read")) 
					{
						//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
						__temp_executeDef1 = false;
						//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Read")) );
					}
					
					//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
					break;
				}
				
				
				case 3257:
				{
					//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
					if (field.equals("f_")) 
					{
						//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
						__temp_executeDef1 = false;
						//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
						return this.f_;
					}
					
					//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
					break;
				}
				
				
				case -1710364737:
				{
					//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
					if (field.equals("buffer_size_")) 
					{
						//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
						__temp_executeDef1 = false;
						//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
						return this.buffer_size_;
					}
					
					//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
					break;
				}
				
				
				case 227996703:
				{
					//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
					if (field.equals("buffer_")) 
					{
						//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
						__temp_executeDef1 = false;
						//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
						return this.buffer_;
					}
					
					//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
					break;
				}
				
				
			}
			
			//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
		{
			//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			switch (field.hashCode())
			{
				case -1710364737:
				{
					//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
					if (field.equals("buffer_size_")) 
					{
						//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
						__temp_executeDef1 = false;
						//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
						return ((double) (this.buffer_size_) );
					}
					
					//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
					break;
				}
				
				
			}
			
			//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
		{
			//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			switch (field.hashCode())
			{
				case 2543030:
				{
					//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
					if (field.equals("Read")) 
					{
						//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
						__temp_executeDef1 = false;
						//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
						return this.Read(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((haxe.root.Array<java.lang.Object>) (dynargs.__get(1)) ));
					}
					
					//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
					break;
				}
				
				
			}
			
			//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
		baseArr.push("buffer_size_");
		//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
		baseArr.push("buffer_");
		//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
		baseArr.push("f_");
		//line 13 "C:\\Users\\Dominik\\Brotli\\src\\encode\\streams\\BrotliIn.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


