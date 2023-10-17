# react-native-bypass-keyguard

React Native Bypass power button password for Android only

## Installation

```sh
npm install react-native-bypass-keyguard
```

## Usage

```js
import { showOverKeyguard,clearShowOverKeyguard } from 'react-native-bypass-keyguard';

// ...

  React.useEffect(() => {
    showOverKeyguard();
    return()=>{
      clearShowOverKeyguard()
    }
  }, []);
```

## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

MIT

---

Made with [create-react-native-library](https://github.com/callstack/react-native-builder-bob)
