// Generated by Haxe 3.4.0

#pragma warning disable 109, 114, 219, 429, 168, 162
public class Date : global::haxe.lang.HxObject {
	
	public Date(global::haxe.lang.EmptyObject empty) {
	}
	
	
	public Date(global::System.DateTime native) {
		global::Date.__hx_ctor__Date(((global::Date) (this) ), ((global::System.DateTime) (native) ));
	}
	
	
	public Date(int year, int month, int day, int hour, int min, int sec) {
		global::Date.__hx_ctor__Date(((global::Date) (this) ), ((int) (year) ), ((int) (month) ), ((int) (day) ), ((int) (hour) ), ((int) (min) ), ((int) (sec) ));
	}
	
	
	public static void __hx_ctor__Date(global::Date __hx_this, global::System.DateTime native) {
		__hx_this.date = native;
	}
	
	
	public static void __hx_ctor__Date(global::Date __hx_this, int year, int month, int day, int hour, int min, int sec) {
		unchecked {
			if (( day <= 0 )) {
				day = 1;
			}
			
			if (( year <= 0 )) {
				year = 1;
			}
			
			__hx_this.date = new global::System.DateTime(year, ( month + 1 ), day, hour, min, sec);
		}
	}
	
	
	public static readonly long epochTicks = new global::System.DateTime(1970, 1, 1).Ticks;
	
	public global::System.DateTime date;
	
	public override object __hx_setField(string field, int hash, object @value, bool handleProperties) {
		unchecked {
			switch (hash) {
				case 1113806382:
				{
					this.date = ((global::System.DateTime) (@value) );
					return @value;
				}
				
				
				default:
				{
					return base.__hx_setField(field, hash, @value, handleProperties);
				}
				
			}
			
		}
	}
	
	
	public override object __hx_getField(string field, int hash, bool throwErrors, bool isCheck, bool handleProperties) {
		unchecked {
			switch (hash) {
				case 1113806382:
				{
					return this.date;
				}
				
				
				default:
				{
					return base.__hx_getField(field, hash, throwErrors, isCheck, handleProperties);
				}
				
			}
			
		}
	}
	
	
	public override void __hx_getFields(global::Array<object> baseArr) {
		baseArr.push("date");
		base.__hx_getFields(baseArr);
	}
	
	
}

