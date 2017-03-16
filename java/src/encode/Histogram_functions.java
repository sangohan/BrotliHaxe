// Generated by Haxe 3.4.0
package encode;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Histogram_functions extends haxe.lang.HxObject
{
	static
	{
		//line 19 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
		encode.Histogram_functions.HistogramLiteralInt = 256;
		//line 22 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
		encode.Histogram_functions.HistogramCommandInt = 704;
		//line 24 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
		encode.Histogram_functions.HistogramDistanceInt = 520;
		//line 26 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
		encode.Histogram_functions.HistogramBlockLengthInt = 26;
		//line 29 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
		encode.Histogram_functions.HistogramContextMapInt = 272;
		//line 32 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
		encode.Histogram_functions.HistogramBlockTypeInt = 258;
		//line 34 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
		encode.Histogram_functions.kLiteralContextBits = 6;
		//line 35 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
		encode.Histogram_functions.kDistanceContextBits = 2;
	}
	
	public Histogram_functions(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Histogram_functions()
	{
		//line 84 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
		encode.Histogram_functions.__hx_ctor_encode_Histogram_functions(this);
	}
	
	
	public static void __hx_ctor_encode_Histogram_functions(encode.Histogram_functions __hx_this)
	{
	}
	
	
	public static encode.histogram.Histogram HistogramLiteral()
	{
		//line 18 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
		return new encode.histogram.Histogram(((int) (256) ));
	}
	
	
	public static int HistogramLiteralInt;
	
	public static encode.histogram.Histogram HistogramCommand()
	{
		//line 21 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
		return new encode.histogram.Histogram(((int) (704) ));
	}
	
	
	public static int HistogramCommandInt;
	
	public static encode.histogram.Histogram HistogramDistance()
	{
		//line 23 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
		return new encode.histogram.Histogram(((int) (520) ));
	}
	
	
	public static int HistogramDistanceInt;
	
	public static encode.histogram.Histogram HistogramBlockLength()
	{
		//line 25 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
		return new encode.histogram.Histogram(((int) (26) ));
	}
	
	
	public static int HistogramBlockLengthInt;
	
	public static encode.histogram.Histogram HistogramContextMap()
	{
		//line 28 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
		return new encode.histogram.Histogram(((int) (272) ));
	}
	
	
	public static int HistogramContextMapInt;
	
	public static encode.histogram.Histogram HistogramBlockType()
	{
		//line 31 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
		return new encode.histogram.Histogram(((int) (258) ));
	}
	
	
	public static int HistogramBlockTypeInt;
	
	public static int kLiteralContextBits;
	
	public static int kDistanceContextBits;
	
	public static void BuildHistograms(haxe.root.Array<encode.command.Command> cmds, int num_commands, encode.metablock.BlockSplit literal_split, encode.metablock.BlockSplit insert_and_copy_split, encode.metablock.BlockSplit dist_split, int[] ringbuffer, int start_pos, int mask, int prev_byte, int prev_byte2, haxe.root.Array<java.lang.Object> context_modes, haxe.root.Array<encode.histogram.Histogram> literal_histograms, haxe.root.Array<encode.histogram.Histogram> insert_and_copy_histograms, haxe.root.Array<encode.histogram.Histogram> copy_dist_histograms)
	{
		//line 52 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
		int pos = start_pos;
		//line 53 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
		encode.block_splitter.BlockSplitIterator literal_it = new encode.block_splitter.BlockSplitIterator(((encode.metablock.BlockSplit) (literal_split) ));
		//line 54 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
		encode.block_splitter.BlockSplitIterator insert_and_copy_it = new encode.block_splitter.BlockSplitIterator(((encode.metablock.BlockSplit) (insert_and_copy_split) ));
		//line 55 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
		encode.block_splitter.BlockSplitIterator dist_it = new encode.block_splitter.BlockSplitIterator(((encode.metablock.BlockSplit) (dist_split) ));
		//line 56 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
		{
			//line 56 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
			int _g1 = 0;
			//line 56 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
			while (( _g1 < num_commands ))
			{
				//line 56 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
				int i = _g1++;
				//line 57 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
				encode.command.Command cmd = cmds.__get(i);
				//line 58 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
				insert_and_copy_it.Next();
				//line 59 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
				insert_and_copy_histograms.__get(insert_and_copy_it.type_).Add1(((int) (haxe.lang.Runtime.toInt(cmd.cmd_prefix_.__get(0))) ));
				//line 61 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
				{
					//line 61 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
					int _g3 = 0;
					//line 61 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
					int _g2 = cmd.insert_len_;
					//line 61 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
					while (( _g3 < _g2 ))
					{
						//line 61 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
						 ++ _g3;
						//line 62 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
						literal_it.Next();
						//line 63 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
						int context = ( (((int) (( literal_it.type_ << 6 )) )) + ((int) (encode.Context.ContextFunction(prev_byte, prev_byte2, ((int) (haxe.lang.Runtime.toInt(context_modes.__get(literal_it.type_))) ))) ) );
						//line 65 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
						literal_histograms.__get(context).Add1(((int) (((int[]) (ringbuffer) )[( pos & mask )]) ));
						//line 66 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
						prev_byte2 = prev_byte;
						//line 67 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
						prev_byte = ((int) (((int[]) (ringbuffer) )[( pos & mask )]) );
						//line 68 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
						 ++ pos;
					}
					
				}
				
				//line 70 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
				pos += cmd.copy_len_;
				//line 71 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
				if (( cmd.copy_len_ > 0 )) 
				{
					//line 72 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
					prev_byte2 = ((int) (((int[]) (ringbuffer) )[( ( pos - 2 ) & mask )]) );
					//line 73 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
					prev_byte = ((int) (((int[]) (ringbuffer) )[( ( pos - 1 ) & mask )]) );
					//line 74 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
					int a = ((int) (haxe.lang.Runtime.toInt(cmd.cmd_prefix_.__get(0))) );
					//line 74 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
					boolean aNeg = ( ((int) (a) ) < 0 );
					//line 74 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
					if (( (( aNeg != false )) ? (aNeg) : (( ((int) (a) ) >= ((int) (128) ) )) )) 
					{
						//line 75 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
						dist_it.Next();
						//line 76 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
						int context1 = ( (( dist_it.type_ << 2 )) + cmd.DistanceContext() );
						//line 78 "C:\\Users\\Dominik\\Brotli\\src\\encode\\Histogram_functions.hx"
						copy_dist_histograms.__get(context1).Add1(((int) (haxe.lang.Runtime.toInt(cmd.dist_prefix_.__get(0))) ));
					}
					
				}
				
			}
			
		}
		
	}
	
	
}

