function create_validator(mode, number) {
	if (mode == 'Max') {
		return value => value < number;
	} else if (mode == 'Min') {
		return value => value > number;
	}
}

var is_below_max = create_validator('Max', 31);

console.log(is_below_max(15));
console.log(is_below_max(32));