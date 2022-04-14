function Building(styleProps){

    return <>
        <div id="building" style={{
            height: styleProps.building.height,
            width: styleProps.building.width,
            top: styleProps.building.top
        }}>{JSON.stringify(styleProps)}</div>
    </>
}

export default Building