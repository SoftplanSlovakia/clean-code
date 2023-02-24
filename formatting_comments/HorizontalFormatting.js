const path = require('path');
const fs = require('fs');

class GoodHorizontalFormatting {
	
	constructor(storageDirectory) {
		this.storagePath = path.join(__dirname, storageDirectory);
		this.setupStorageDirectory();
	}

	setupStorageDirectory() {
		if (!fs.existsSync(this.storagePath)) {
		  this.createStorageDirectory();
		} else {
		  console.log('Directory exists already.');
		}
	  }
	
	createStorageDirectory() {
		const storagePath = path.join(__dirname, 'temp', '2020-10', 'images');
		fs.mkdir(storagePath, this.handleOperationCompletion);
	}
}

class BadHorizontalFormatting {

	constructor(storageDirectory) {this.storagePath = path.join(__dirname, storageDirectory); this.setupStorageDirectory();}

	setupStorageDirectory() {
		if (!fs.existsSync(this.storagePath)) {
		  this.createStorageDirectory();
		} else {
		  console.log('Directory exists already.');
		}
	  }
	
	createStorageDirectory() {
		fs.mkdir(path.join(__dirname, 'temp', '2020-10', 'images'), this.handleOperationCompletion);
	}

	createStorageDirectory() {
		const storagePathForStoringImagesInATemporaryFolderFor2020 = path.join(__dirname, 'temp', '2020-10', 'images');
		fs.mkdir(storagePathForStoringImagesInATemporaryFolderFor2020, this.handleOperationCompletion);
	}
}