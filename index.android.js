import React, {Component, PropTypes} from 'react'
import {requireNativeComponent, View} from 'react-native'


class CircularProgress extends Component {

	constructor(props) {
        super(props)
    }

	render() {
		return (<RCTCircularProgress {...this.props} />)
	}
}

CircularProgress.propTypes = {
	...View.propTypes,
	progress: PropTypes.number,
	duration: PropTypes.number,
	progressColor: PropTypes.string,
	bgColor: PropTypes.string,
	progressWidth: PropTypes.number,
	bgWidth: PropTypes.number
}


const RCTCircularProgress = requireNativeComponent('RCTCircularProgress', CircularProgress)

export default CircularProgress
