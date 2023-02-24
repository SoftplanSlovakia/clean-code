function create(m, n) {
	if (m == 'Max') {
		return (v) => v < n;
	} else if (m == 'Min') {
		return (v) => v > n;
	}
}

var max = create('Max', 31);

console.log(max(15));
console.log(max(32));