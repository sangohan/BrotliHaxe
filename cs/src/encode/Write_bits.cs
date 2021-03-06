// Generated by Haxe 3.4.0

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace encode {
	public class Write_bits : global::haxe.lang.HxObject {
		
		public Write_bits(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Write_bits() {
			global::encode.Write_bits.__hx_ctor_encode_Write_bits(this);
		}
		
		
		public static void __hx_ctor_encode_Write_bits(global::encode.Write_bits __hx_this) {
		}
		
		
		public static void WriteBits(int n_bits, uint bits, global::Array<int> pos, uint[] array) {
			unchecked {
				int array_pos_off = ( pos[0] >> 3 );
				int bits_reserved_in_first_byte = ( pos[0] & 7 );
				bits = ((uint) (( bits << bits_reserved_in_first_byte )) );
				{
					int _g = array_pos_off++;
					((uint[]) (array) )[_g] = ((uint) (( ((uint) (((uint[]) (array) )[_g]) ) | ((uint) (( bits & 255 )) ) )) );
				}
				
				int bits_left_to_write = ( ( n_bits - 8 ) + bits_reserved_in_first_byte );
				while (( bits_left_to_write >= 1 )) {
					bits = ((uint) (((uint) (( ((uint) (bits) ) >> 8 )) )) );
					((uint[]) (array) )[array_pos_off++] = ((uint) (( bits & 255 )) );
					bits_left_to_write -= 8;
				}
				
				((uint[]) (array) )[array_pos_off] = ((uint) (0) );
				pos[0] += n_bits;
			}
		}
		
		
		public static void WriteBitsPrepareStorage(int pos, uint[] array) {
			unchecked {
				((uint[]) (array) )[( pos >> 3 )] = ((uint) (0) );
			}
		}
		
		
	}
}


