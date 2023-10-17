# react-native-bypass-keyguard

React Native Bypass power button password for Android only

## Installation

Using npm:

```sh
npm install react-native-bypass-keyguard
```

or using yarn:

```sh
yarn add react-native-bypass-keyguard
```

## Getting Started

Check out [the documentation website](https://developer.android.com/reference/android/view/WindowManager.LayoutParams).

## Usage

```js
import {
  showOverKeyguard,
  clearShowOverKeyguard,
} from 'react-native-bypass-keyguard';

// ...

React.useEffect(() => {
  showOverKeyguard();
  return () => {
    clearShowOverKeyguard();
  };
}, []);
```

## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## Author

- [Mohammad Saqlain](https://mohammadsaqlain.netlify.app/)

## Sponsor & Support

To keep this library maintained and up-to-date please consider [follow it on GitHub](https://github.com/saqlain110)

## License

[MIT](./LICENSE)

---
