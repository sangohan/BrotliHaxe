<?php

// Generated by Haxe 3.4.0
class encode_entropy_encode_HuffmanTree {
	public function __construct() {}
	public function HuffmanTree3($count, $left, $right) {
		$this->total_count_ = $count;
		$this->index_left_ = $left;
		$this->index_right_or_value_ = $right;
	}
	public $total_count_;
	public $index_left_;
	public $index_right_or_value_;
	public function __call($m, $a) {
		if(isset($this->$m) && is_callable($this->$m))
			return call_user_func_array($this->$m, $a);
		else if(isset($this->__dynamics[$m]) && is_callable($this->__dynamics[$m]))
			return call_user_func_array($this->__dynamics[$m], $a);
		else if('toString' == $m)
			return $this->__toString();
		else
			throw new HException('Unable to call <'.$m.'>');
	}
	function __toString() { return 'encode.entropy_encode.HuffmanTree'; }
}
